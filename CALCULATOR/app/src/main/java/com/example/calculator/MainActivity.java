package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText NUM1;
    private EditText NUM2;
    private TextView RESULT;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        NUM1=findViewById(R.id.NUM1);
        NUM2=findViewById(R.id.NUM2);
        RESULT=findViewById(R.id.RESULT);
        0public void onAddition;(View view){
            String a=NUM1.getText().toString();
            String b=NUM2.getText().toString();
            if(!a.isEmpty()&& !b.isEmpty()) {
                double a = Double.parseDouble(a);
                double b = Double.parseDouble(b);
                double RESULT = a + b;
                RESULT.setText("RESULT:" + result);
            }
            else{
                RESULT.setText("please enter numbers in both fields");


            }
        }
    }
