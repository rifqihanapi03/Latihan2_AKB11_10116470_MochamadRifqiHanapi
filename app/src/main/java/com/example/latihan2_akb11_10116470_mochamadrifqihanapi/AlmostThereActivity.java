package com.example.latihan2_akb11_10116470_mochamadrifqihanapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlmostThereActivity extends AppCompatActivity {

    Button bVerify;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        bVerify = (Button) findViewById(R.id.btn_verify);
        bVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(getApplicationContext(), VerifyAccountActivity.class);
                startActivity(move);
            }
        });
    }
}
