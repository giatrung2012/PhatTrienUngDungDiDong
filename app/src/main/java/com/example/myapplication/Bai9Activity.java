package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Bai9Activity extends AppCompatActivity {

    EditText etId, etName, etExtraInfo;
    CheckBox cbHobby1, cbHobby2, cbHobby3;
    Button btnSend;
    RadioGroup rgDegree;
    RadioButton rbDegree1, rbDegree2, rbDegree3;
    String name, id, extraInfo, degree, message;
    int selectedDegreeId, status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai9);

        cbHobby1 = findViewById(R.id.cb_hobby_1);
        cbHobby2 = findViewById(R.id.cb_hobby_2);
        cbHobby3 = findViewById(R.id.cb_hobby_3);
        rgDegree = findViewById(R.id.rg_dergee);
        btnSend = findViewById(R.id.btn_send);
        etName = findViewById(R.id.et_name);
        etExtraInfo = findViewById(R.id.et_extra_info);
        etId = findViewById(R.id.et_id);
        rbDegree1 = findViewById(R.id.rb_degree1);
        rbDegree2 = findViewById(R.id.rb_degree2);
        rbDegree3 = findViewById(R.id.rb_degree3);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = etName.getText().toString().trim();
                id = etId.getText().toString().trim();
                extraInfo = etExtraInfo.getText().toString().trim();

                status = 0;
                if (name.isEmpty() || name.length() < 3) {
                    etName.setError("Tên không được để trống và phải có ít nhất 3 ký tự");
                    status++;
                }
                if (id.isEmpty() || id.length() != 9 || !TextUtils.isDigitsOnly(id)) {
                    etId.setError("CMND chỉ được nhập kiểu số và phải có đúng 9 chữ số");
                    status++;
                }
                if (!cbHobby1.isChecked() && !cbHobby2.isChecked() && !cbHobby3.isChecked()) {
                    Toast.makeText(Bai9Activity.this,
                            "Bạn phải chọn ít nhất một sở thích",
                            Toast.LENGTH_SHORT).show();
                    status++;
                }

                if (status == 0) {
                    selectedDegreeId = rgDegree.getCheckedRadioButtonId();
                    degree = "Đại học";
                    switch (selectedDegreeId) {
                        case R.id.rb_degree1:
                            degree = "Trung cấp";
                            break;
                        case R.id.rb_degree2:
                            degree = "Cao đẳng";
                            break;
                    }

                    message = name + "\n" +
                            id + "\n" +
                            degree + "\n";
                    if (cbHobby1.isChecked()) {
                        message += "Đọc báo, ";
                    }
                    if (cbHobby2.isChecked()) {
                        message += "Đọc sách, ";
                    }
                    if (cbHobby3.isChecked()) {
                        message += "Đọc coding, ";
                    }
                    message = message.substring(0, message.length() - 2);
                    message += "\n";
                    message += "---------------------------------------------------";
                    if (!extraInfo.isEmpty()) {
                        message += "\nThông tin bổ sung: \n" + extraInfo + "\n";
                    }
                    message += "---------------------------------------------------";
                    AlertDialog.Builder builder = new AlertDialog.Builder(Bai9Activity.this);
                    builder.setTitle("Thông tin cá nhân");
                    builder.setMessage(message);
                    builder.setPositiveButton("OK", null);
                    builder.show();
                }
            }
        });
            }
    }
