package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Button dangkyBtn = (Button) findViewById(R.id.btnReg);
        Button dangnhapBtn = (Button) findViewById(R.id.btnLog);
        final EditText id = (EditText) findViewById(R.id.txtUsername);
        final EditText password = (EditText) findViewById(R.id.txtPassword);
        dangkyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login2.this, register_activity.class);
                startActivity(intent);
            }
        });
        dangnhapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(Login2.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login2.this, MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Login2.this,"Sai id hoặc password",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
