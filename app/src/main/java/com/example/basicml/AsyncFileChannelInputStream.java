package com.example.basicml;

import android.os.Build;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncFileChannelInputStream extends InputStream {
    private final AsynchronousFileChannel channel;
    private final ByteBuffer buffer;
    private long position;
    private boolean endOfFile = false;

    public AsyncFileChannelInputStream(Path filePath) throws IOException {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            this.channel = AsynchronousFileChannel.open(filePath, StandardOpenOption.READ);
        }
        this.buffer = ByteBuffer.allocate(8192); // 8KB buffer
        this.position = 0;
        this.buffer.limit(0); // Start with an empty buffer
    }

    @Override
    public int read() throws IOException {
        if (!buffer.hasRemaining()) { // Refill buffer if empty
            if (!refillBuffer()) {
                return -1; // End of file
            }
        }
        return buffer.get() & 0xFF; // Return a single byte
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        if (!buffer.hasRemaining()) { // Refill buffer if empty
            if (!refillBuffer()) {
                return -1; // End of file
            }
        }

        int bytesToRead = Math.min(len, buffer.remaining());
        buffer.get(b, off, bytesToRead);
        return bytesToRead;
    }

    private boolean refillBuffer() throws IOException {
        if (endOfFile) {
            return false;
        }

        buffer.clear(); // Prepare the buffer for writing
        CompletableFuture<Integer> future = new CompletableFuture<>();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            channel.read(buffer, position, null, new CompletionHandler<>() {
                @Override
                public void completed(Integer result, Object attachment) {
                    if (result == -1) {
                        endOfFile = true;
                    } else {
                        position += result;
                    }
                    buffer.flip(); // Prepare buffer for reading
                    future.complete(result);
                }

                @Override
                public void failed(Throwable exc, Object attachment) {
                    future.completeExceptionally(exc);
                }
            });
        }

        try {
            int bytesRead = future.get();
            return bytesRead > 0;
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("Failed to read from AsynchronousFileChannel", e);
        }
    }

    @Override
    public void close() throws IOException {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            channel.close();
        }
        super.close();
    }
}
