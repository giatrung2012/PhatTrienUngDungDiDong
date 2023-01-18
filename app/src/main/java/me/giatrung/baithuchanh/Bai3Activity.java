package me.giatrung.baithuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai3Activity extends AppCompatActivity implements View.OnClickListener {

    EditText etA, etB;
    TextView tvResult;
    Button btnSubtract;
    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        etA = (EditText) findViewById(R.id.et_a);
        etB = (EditText) findViewById(R.id.et_b);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnSubtract = (Button) findViewById(R.id.btn_subtract);

        btnSubtract.setOnClickListener(this);
    }

    public void getSum(View view) {
        a = Integer.parseInt(etA.getText().toString());
        b = Integer.parseInt(etB.getText().toString());
        tvResult.setText(String.valueOf(a + b));
    }

    @Override
    public void onClick(View view) {
        a = Integer.parseInt(etA.getText().toString());
        b = Integer.parseInt(etB.getText().toString());
        tvResult.setText(String.valueOf(a - b));
    }
}