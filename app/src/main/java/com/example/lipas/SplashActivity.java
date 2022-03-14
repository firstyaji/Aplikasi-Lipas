package com.example.lipas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    // 4000 = 4 detik
    private int loading = 1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.splash_screen);

        // fungsi handler?
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent move = new Intent(SplashActivity.this, LogActivity.class);
                startActivity(move);
                finish();
            }
        },loading);


    }
}
