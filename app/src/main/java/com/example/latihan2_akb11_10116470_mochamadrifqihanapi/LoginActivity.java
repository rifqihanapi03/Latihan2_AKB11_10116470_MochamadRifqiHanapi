package com.example.latihan2_akb11_10116470_mochamadrifqihanapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button conreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        conreg = findViewById(R.id.btn_connectFb);
        conreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }

    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.btn_Register:
                intent = new Intent(this,RegisterActivity.class);
                break;
        }
        if (null!=intent) startActivity(intent);
    }
}
