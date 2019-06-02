package com.example.nhom10_doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login2 extends AppCompatActivity {

    Button btnDangNhap;
    EditText txtTaiKhoan, txtMatKhau;
    TextView txtDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Mapping();

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtTaiKhoan.getText().toString().equals("admin") && txtMatKhau.getText().toString().equals("admin")) {
                    Toast.makeText(login2.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login2.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(login2.this, "Sai id hoặc password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        txtDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login2.this, register2.class);
                startActivity(intent);
            }
        });
    }

    private void Mapping() {
        btnDangNhap = (Button) findViewById(R.id.buttonDangNhap);
        txtTaiKhoan = (EditText) findViewById(R.id.txtTaiKhoan);
        txtMatKhau = (EditText) findViewById(R.id.txtMatKhau);
        txtDangKy = (TextView)findViewById(R.id.txtDangKy);
    }
}
