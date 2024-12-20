package com.example.basicml;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.tensorflow.lite.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.tensorflow.lite.Interpreter;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.UStringsKt;

public class LoginPhoneNumberActivity extends AppCompatActivity {

    Button CheckButton;
    EditText textInput;
    TextView spamText, hamText;
    private MappedByteBuffer loadModelFile(String modelPath) throws IOException {
        AssetFileDescriptor fileDescriptor = getAssets().openFd(modelPath);
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number);

        Interpreter tflite;
        try {
            tflite = new Interpreter(loadModelFile("model.tflite"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        CheckButton = findViewById(R.id.check_spam_btn);
        textInput = findViewById(R.id.message_input);
        spamText = findViewById(R.id.spam_text);
        hamText = findViewById(R.id.ham_text);
        float[][] outputArray = new float[1][2];

        CheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String, Integer> wordIndex = null;
                try {
                    wordIndex = TextPreprocessing.loadTokenizer("tokenizer.json");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                List<String> text = TextPreprocessing.toLowerCase((List<String>) textInput);
                text = TextPreprocessing.cleanText(text);
                text = TextPreprocessing.stemWords(text);
                List<List<Integer>> sequences = TextPreprocessing.textsToSequences(text, wordIndex);
                int dimension = 10000; // 벡터화 차원
                double[][] vectors = TextPreprocessing.vectorizeSequences(sequences, dimension);

                try {
                    tflite.run(vectors, outputArray);
                } catch (Exception e) {
                    e.printStackTrace();
                    // UI에 적절히 오류 메시지를 표시하거나 로깅 처리
                }
                float positiveScore = outputArray[0][1];
                float negativeScore = outputArray[0][0];

                if (positiveScore > negativeScore) {
                    spamText.setTextColor(Color.RED);
                    hamText.setTextColor(Color.GRAY);
                } else {
                    spamText.setTextColor(Color.GREEN);
                    hamText.setTextColor(Color.GRAY);
                }
            }
        });

    }
}

