package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OnClickActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin, btnLogout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_on_click);
//        setContentView(R.layout.view_inline_anonymous_listener);
//        setContentView(R.layout.view_interface_on_click_listener);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnLogin.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    public void clickMe(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                Toast.makeText(getApplication(),
                        "Hiệp Sĩ IT: Bạn đang Click vào Button Login",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btnLogout:
                Toast.makeText(getApplication(),
                        "Hiệp Sĩ IT: Bạn đang Click vào Button Logout",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                Toast.makeText(getApplication(),
                        "Hiệp Sĩ IT: Bạn đang Click vào Button Login",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.btnLogout:
                Toast.makeText(getApplication(),
                        "Hiệp Sĩ IT: Bạn đang Click vào Button Logout",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}
