package com.example.myapplication;



import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListLocationAdapter extends BaseAdapter {

    Context context;
    String[] locationArray;
    LayoutInflater inflter;

    public ListLocationAdapter(Context context, String[] locationArray) {
        super();
        this.context = context;
        this.locationArray = locationArray;
        inflter = (LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return locationArray.length;
    }

    @Override
    public String getItem(int position) {
        return locationArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView	= inflter.inflate(R.layout.view_location, null);
        TextView tvLocation = convertView.findViewById(R.id.tv_location);

        if (locationArray[position].length() <= 3) {
            tvLocation.setCompoundDrawablesWithIntrinsicBounds(R.drawable.star, 0, 0, 0);
        } else {
            tvLocation.setCompoundDrawablesWithIntrinsicBounds(R.drawable.planet_earth, 0, 0, 0);
        }

        tvLocation.setText(locationArray[position]);
        return convertView;
    }
}
