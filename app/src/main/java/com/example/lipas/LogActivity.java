package com.example.lipas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_log_daf);

        Button button1 = (Button) findViewById(R.id.log_screen);
        Button button2 = (Button) findViewById(R.id.Reg_screen);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(pindah);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahDaftar = new Intent(getApplicationContext(), DaftarActivity.class);
                startActivity(pindahDaftar);
            }
        });
    }
}
