package com.example.basicml;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.tensorflow.lite.Interpreter;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LoginPhoneNumberActivity extends AppCompatActivity {

    Button CheckButton;
    EditText textInput;
    String outputword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number);

        CheckButton = findViewById(R.id.check_spam_btn);
        textInput = findViewById(R.id.message_input);

        Intent intent = new Intent(LoginPhoneNumberActivity.this, LoginPhoneNumberActivity.class);
        startActivity(intent);

    }
}