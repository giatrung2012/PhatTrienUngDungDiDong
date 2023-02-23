package com.example.myapplication;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyButtonClickListener implements View.OnClickListener {

    EditText etA, etB;
    TextView tvResult;
    double a, b;

    public MyButtonClickListener(EditText etA, EditText etB, TextView tvResult) {
        this.etA = etA;
        this.etB = etB;
        this.tvResult = tvResult;
    }

    @Override
    public void onClick(View view) {
        a = Double.parseDouble(etA.getText().toString());
        b = Double.parseDouble(etB.getText().toString());
        tvResult.setText(String.valueOf(gcd(a, b)));
    }

    public double gcd(double a, double b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (Math.abs(b) < 0.001) {
            return a;
        }
        return (gcd(b, a - Math.floor(a / b) * b));
    }
}
