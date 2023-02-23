package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class Bai14Activity extends AppCompatActivity {

    String[] locationArray;
    ListView lvLocation;
    TextView tvInfo;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai14);

        locationArray = getResources().getStringArray(R.array.location_array);

        tvInfo = findViewById(R.id.tv_info);
        lvLocation = findViewById(R.id.lv_location);
        ListLocationAdapter listLocationAdapter	= new ListLocationAdapter(this, locationArray);
        lvLocation.setAdapter(listLocationAdapter);

        lvLocation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                location = listLocationAdapter.getItem(position);
                tvInfo.setText(location);
            }
        });
    }
}