package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button button;
    EditText editText1;
    EditText editText2;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button1 = findViewById(R.id.button1);
        button1.setText(R.string.btn1);

        TextView TV1 = findViewById(R.id.TV1);
        TV1.setText(R.string.tv1);

        TextView TV2 = findViewById(R.id.TV2);
        TV2.setText(R.string.tv2);

        button = findViewById(R.id.button1);
        editText1 = findViewById(R.id.field1);
        editText2 = findViewById(R.id.field2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.parseInt(editText1.getText().toString());
                int value2 = Integer.parseInt(editText2.getText().toString());

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;

                toast = Toast.makeText(context, message, duration);

                toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.BOTTOM, 0, 0);
                toast.show();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("VALUE1", value1);
                intent.putExtra("VALUE2", value2);
                startActivity(intent);
            }
        });

        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();
    }

    public void goSecond(View v){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}