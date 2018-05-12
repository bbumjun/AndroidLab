package com.example.bumjun.adapterviews;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by bumju on 2018-04-19.
 */

public class MyAdapter extends BaseAdapter{

    public String[] names= {"LEE", "CHOI","KIM","JEONG","RHO"};

    Context mContext;
    public MyAdapter(Context context) {
        mContext = context;
    }
    public int getCount() {
        return names.length;
    }
    public Object getItem(int position ) {
        return names[position];
    }
    public long getItemId(int position) {
        return position ;
    }

    public View getView (int position, View convertView, ViewGroup parent) {

        TextView view = new TextView(mContext);
        view.setText(names[position]);
        view.setTextColor(Color.BLUE);
        return view;

    }

}
