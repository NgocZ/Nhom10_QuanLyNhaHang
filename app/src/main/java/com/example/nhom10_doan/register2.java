package com.example.nhom10_doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class register2 extends AppCompatActivity {
TextView txtDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        txtDangNhap = (TextView)findViewById(R.id.txtDangNhap);
        txtDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register2.this, login2.class);
                startActivity(intent);
            }
        });
    }
}
