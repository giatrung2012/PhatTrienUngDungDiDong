package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bai8Activity extends AppCompatActivity {

    EditText etSolarYear;
    TextView tvLunarYear;
    Button btnConvert;
    String strSolarYear, can, chi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai8);

        etSolarYear = findViewById(R.id.et_solar_year);
        tvLunarYear = findViewById(R.id.tv_lunar_year);
        btnConvert = findViewById(R.id.btn_convert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strSolarYear = etSolarYear.getText().toString();

                if (strSolarYear.isEmpty()) {
                    tvLunarYear.setText("Vui lòng nhập năm dương lịch");
                    return;
                }

                int solarYear = Integer.parseInt(strSolarYear);
                if (solarYear < 1900) {
                    tvLunarYear.setText("Năm dương lịch phải >= 1900");
                    return;
                }

                switch (solarYear % 10) {
                    case 0:
                        can = "Canh";
                        break;
                    case 1:
                        can = "Tân";
                        break;
                    case 2:
                        can = "Nhâm";
                        break;
                    case 3:
                        can = "Quý";
                        break;
                    case 4:
                        can = "Giáp";
                        break;
                    case 5:
                        can = "Ất";
                        break;
                    case 6:
                        can = "Bính";
                        break;
                    case 7:
                        can = "Đinh";
                        break;
                    case 8:
                        can = "Mậu";
                        break;
                    case 9:
                        can = "Kỷ";
                        break;
                }

                switch (solarYear % 12) {
                    case 0:
                        chi = "Thân";
                        break;
                    case 1:
                        chi = "Dậu";
                        break;
                    case 2:
                        chi = "Tuất";
                        break;
                    case 3:
                        chi = "Hợi";
                        break;
                    case 4:
                        chi = "Tý";
                        break;
                    case 5:
                        chi = "Sửu";
                        break;
                    case 6:
                        chi = "Dần";
                        break;
                    case 7:
                        chi = "Mẹo";
                        break;
                    case 8:
                        chi = "Thìn";
                        break;
                    case 9:
                        chi = "Tỵ";
                        break;
                    case 10:
                        chi = "Ngọ";
                        break;
                    case 11:
                        chi = "Mùi";
                        break;
                }

                tvLunarYear.setText(can + " " + chi);
            }
        });
    }
}