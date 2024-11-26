package com.example.basicml;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import org.tartarus.snowball.ext.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.tensorflow.lite.Interpreter;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.UStringsKt;

public class LoginPhoneNumberActivity extends AppCompatActivity {

    Button CheckButton;
    EditText textInput;
    TextView spamText, hamText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number);

        Interpreter tflite;
        tflite = new Interpreter(loadModelFile("org/model.tflite"));

        CheckButton = findViewById(R.id.check_spam_btn);
        textInput = findViewById(R.id.message_input);
        spamText = findViewById(R.id.spam_text);
        hamText = findViewById(R.id.ham_text);

        CheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tokenizerPath = "tokenizer.json";
                Map<String, Integer> wordIndex = null;
                try {
                    wordIndex = TextPreprocessing.loadTokenizer("org/tokenizer.json");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                List<String> text = TextPreprocessing.toLowerCase((List<String>) textInput);
                text = TextPreprocessing.cleanText(text);
                text = TextPreprocessing.stemWords(text);
                List<List<Integer>> sequences = TextPreprocessing.textsToSequences(text, wordIndex);
                int dimension = 10000; // 벡터화 차원
                double[][] vectors = TextPreprocessing.vectorizeSequences(sequences, dimension);
                if (true) {
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

