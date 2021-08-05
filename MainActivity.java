package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        EditText txt1 = findViewById(R.id.editTextNumber);
        EditText txt2 = findViewById(R.id.editTextNumber2);
        TextView res = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numStr1 = txt1.getText().toString();
                String numStr2 = txt2.getText().toString();
                int num1 = (int)Float.parseFloat(numStr1);
                int num2 = (int)Float.parseFloat(numStr2);
                int result = num1 + num2;
                String resultStr = String.valueOf(result);
                res.setText(resultStr);
            }
        });
    }
}