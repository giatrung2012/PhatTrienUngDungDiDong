package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Bai11Activity extends AppCompatActivity {

    String[] names;
    ListView lvName;
    TextView tvInfo;
    ArrayAdapter<String> lsNameAdapter;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai11);

        names = getResources().getStringArray(R.array.name_array);

        lsNameAdapter = new ArrayAdapter<String>(this,
                R.layout.view_name,
                R.id.tv_name,
                names);

        tvInfo = findViewById(R.id.tv_info);
        lvName = findViewById(R.id.lv_name);
        lvName.setAdapter(lsNameAdapter);

        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                name = lsNameAdapter.getItem(position);
                tvInfo.setText(String.format("Possition: %d, value: %s", position, name));
            }
        });
    }
}