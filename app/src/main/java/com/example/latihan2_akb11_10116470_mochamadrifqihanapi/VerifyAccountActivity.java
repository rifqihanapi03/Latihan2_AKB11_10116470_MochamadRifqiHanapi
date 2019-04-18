package com.example.latihan2_akb11_10116470_mochamadrifqihanapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VerifyAccountActivity extends AppCompatActivity {
    Button kirim;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
        kirim = (Button)findViewById(R.id.btn_send);
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), UserHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
