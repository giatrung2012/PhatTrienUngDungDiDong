package me.giatrung.baithuchanh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Bai2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
    }

    public void exit(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        // Setting Alert Dialog Title
        alertDialogBuilder.setTitle("Xác nhận để thoát..!!!");
        // Icon Of Alert Dialog
        alertDialogBuilder.setIcon(android.R.drawable.ic_dialog_info);
        // Setting Alert Dialog Message
        alertDialogBuilder.setMessage("Bạn có muốn thoát?");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Đồng ý", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //Đóng Activity hiện tại
                        finish();
                    }
                });
        alertDialogBuilder.setNegativeButton("Không đồng ý", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Bai2Activity.this,
                                "Bạn đã click vào nút không đồng ý",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        alertDialogBuilder.setNeutralButton("Hủy", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),
                                "Bạn đã click vào nút hủy",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}