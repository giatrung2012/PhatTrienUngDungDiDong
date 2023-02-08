package me.giatrung.baithuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bai4Activity extends AppCompatActivity {

    EditText etF, etC;
    Button btnToC, btnToF, btnClear;
    double f, c, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        etF = findViewById(R.id.et_f);
        etC = findViewById(R.id.et_c);
        btnToC = findViewById(R.id.btn_to_c);
        btnToF = findViewById(R.id.btn_to_f);
        btnClear = findViewById(R.id.btn_clear);

        btnToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f = Double.parseDouble(etF.getText().toString());
                res = (f - 32) * 5 / 9;
                etC.setText(String.valueOf(res));
            }
        });

        btnToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c = Double.parseDouble(etC.getText().toString());
                res = c * 9 / 5 + 32;
                etF.setText(String.valueOf(res));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etF.setText("");
                etC.setText("");
            }
        });
    }
}