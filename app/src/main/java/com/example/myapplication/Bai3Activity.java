package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai3Activity extends AppCompatActivity implements View.OnClickListener {

    EditText etA, etB;
    TextView tvResult;
    Button btnSubtract, btnMultiply, btnDivide, btnGCD, btnExit;
    View.OnClickListener listener;
    double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        etA = findViewById(R.id.et_a);
        etB = findViewById(R.id.et_b);
        tvResult = findViewById(R.id.tv_result);
        btnSubtract = findViewById(R.id.btn_subtract);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);
        btnGCD = findViewById(R.id.btn_gcd);
        btnExit = findViewById(R.id.btn_exit);

        btnMultiply.setOnClickListener(this);
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(etA.getText().toString());
                b = Double.parseDouble(etB.getText().toString());
                tvResult.setText(String.valueOf(a - b));
            }
        });

        listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(etA.getText().toString());
                b = Double.parseDouble(etB.getText().toString());
                tvResult.setText(String.valueOf(a / b));
            }
        };
        btnDivide.setOnClickListener(listener);

        btnGCD.setOnClickListener(new MyButtonClickListener(etA, etB, tvResult));

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void getSum(View view) {
        a = Double.parseDouble(etA.getText().toString());
        b = Double.parseDouble(etB.getText().toString());
        tvResult.setText(String.valueOf(a + b));
    }

    @Override
    public void onClick(View view) {
        a = Double.parseDouble(etA.getText().toString());
        b = Double.parseDouble(etB.getText().toString());
        tvResult.setText(String.valueOf(a * b));
    }
}
