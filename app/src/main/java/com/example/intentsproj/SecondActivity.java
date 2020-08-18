package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    EditText editText1, editText2;
    Button plusBtn, minusBtn, multiBtn, divideBtn;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView TV1 = findViewById(R.id.TV1);
        TV1.setText(R.string.tv1);

        TextView TV2 = findViewById(R.id.TV2);
        TV2.setText(R.string.tv2);

        Button plus = findViewById(R.id.plus);
        plus.setText(R.string.btn2);

        Button minus = findViewById(R.id.minus);
        minus.setText(R.string.btn3);

        Button multi = findViewById(R.id.multi);
        multi.setText(R.string.btn4);

        Button divide = findViewById(R.id.divide);
        divide.setText(R.string.btn5);

        textView = findViewById(R.id.TV5);

        Intent intent = getIntent();
        final int value1 = intent.getIntExtra("VALUE1", 0);
        final int value2 = intent.getIntExtra("VALUE2", 0);

        editText1 = findViewById(R.id.field1);
        editText2 = findViewById(R.id.field2);

        editText1.setText(String.valueOf(value1));
        editText2.setText(String.valueOf(value2));

        plusBtn = findViewById(R.id.plus);
        minusBtn = findViewById(R.id.minus);
        multiBtn = findViewById(R.id.multi);
        divideBtn = findViewById(R.id.divide);

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = value1 + value2;
                textView.setText(value1 + " + " + value2 + " = " + sum);
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = value1 - value2;
                textView.setText(value1 + " - " + value2 + " = " + sum);
            }
        });

        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = value1 * value2;
                textView.setText(value1 + " * " + value2 + " = " + sum);
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = value1 / value2;
                textView.setText(value1 + " / " + value2 + " = " + sum);
            }
        });
    }
}