package me.giatrung.baithuchanh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Bai7Activity extends AppCompatActivity {

    Button btnLogin, btnExit;
    CheckBox cbRememberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);

        btnLogin = findViewById(R.id.btn_login);
        btnExit = findViewById(R.id.btn_exit);
        cbRememberMe = findViewById(R.id.cb_remember_me);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbRememberMe.isChecked()) {
                    Toast.makeText(Bai7Activity.this,
                            "Chào mừng bạn đăng nhập hệ thống, bạn đã lưu thông tin",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Bai7Activity.this,
                            "Chào mừng bạn đăng nhập hệ thống, bạn không lưu thông tin",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Bai7Activity.this)
                        .setTitle("Question?")
                        .setMessage("Are you sure you want to exit?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }
}