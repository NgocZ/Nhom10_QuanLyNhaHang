package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class food_activity extends Activity {
        String[] name = {"Gỏi bò", "Ức vịt sốt rượu vang ",
                "Bồ câu tiềm bí đỏ", "Gà nướng",
                "Bò lá lốt", "Heo tộc quay lu chặt mẹt",
                "Cá tầm nướng muối ớt","Cánh gà chiên mật ong",
                "Gói cuốn tôm thịt","Cá chình nướng muối ớt"};
        String[] dec = {"Gỏi bò", "Ức vịt sốt rượu vang ",
                "Bồ câu tiềm bí đỏ", "Gà nướng",
                "Bò lá lốt", "Heo tộc quay lu chặt mẹt",
                "Cá tầm nướng muối ớt","Cánh gà chiên mật ong",
                "Gói cuốn tôm thịt","Cá chình nướng muối ớt"};
        int[] image = {R.drawable.h1, R.drawable.h2,
                R.drawable.h3, R.drawable.h4,
                R.drawable.h5, R.drawable.h6,
                R.drawable.h7, R.drawable.h8,
                R.drawable.h9, R.drawable.h10};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_food);
            GridView gridView = (GridView) findViewById(R.id.foodGV);
            GridViewAdapter_Food gridViewAdapter = new GridViewAdapter_Food(this, name, image, dec);
            gridView.setAdapter(gridViewAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                }
            });
        }
    }
