package com.example.nhom10_doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewAdapter_Order extends BaseAdapter {
    private Context context;
    private String[] name;
    private int[] image;
    private String [] dec;

    public GridviewAdapter_Order(Context context, String[] name, int[] image, String[] dec) {
        this.context = context;
        this.name = name;
        this.image = image;
        this.dec = dec;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.gridview_order_row,null);
        TextView textView = (TextView)convertView.findViewById(R.id.foodNameView1);
        TextView textView2 = (TextView)convertView.findViewById(R.id.fooddecView1);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageFoodView1);

        textView.setText(name[position]);
        textView2.setText(dec[position]);
        imageView.setImageResource(image[position]);
        return convertView;
    }
}
