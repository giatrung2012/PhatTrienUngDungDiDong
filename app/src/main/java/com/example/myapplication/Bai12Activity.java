package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Bai12Activity extends AppCompatActivity {

    String[] nameArray;
    ListView lvName;
    TextView tvInfo;
    ArrayAdapter<String> lsNameAdapter;
    String name;
    EditText etName;
    Button btnInput;
    ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai12);

        nameArray = getResources().getStringArray(R.array.name_array);
        names = new ArrayList<>();
        Collections.addAll(names, nameArray);

        lsNameAdapter = new ArrayAdapter<>(this,
                R.layout.view_name,
                R.id.tv_name,
                names);

        tvInfo = findViewById(R.id.tv_info);
        etName = findViewById(R.id.et_name);
        btnInput = findViewById(R.id.btn_input);
        lvName = findViewById(R.id.lv_name);
        lvName.setAdapter(lsNameAdapter);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = etName.getText().toString();
                names.add(name);
                lsNameAdapter.notifyDataSetChanged();
            }
        });

        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                name = lsNameAdapter.getItem(position);
                tvInfo.setText(String.format("Possition: %d, value: %s", position, name));
            }
        });
    }
}