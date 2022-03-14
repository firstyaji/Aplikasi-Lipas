package com.example.lipas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText et_nLogin, et_pasLogin;
    private TextView login, password;
    protected Button mDash;
    public TextView mDaftar;

    //pake final kok eror ya

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_login);

        et_nLogin =  findViewById(R.id.et_nama_login);
        et_pasLogin =  findViewById(R.id.et_pass_login);
        mDash = (Button) findViewById(R.id.masuk_home);
        mDaftar =  findViewById(R.id.masukKe_daftar);

        mDash.setOnClickListener (view -> { //with lamda
            Intent pindah = new Intent(getApplicationContext(), DashActivity.class); //explicit intent
            startActivity(pindah);
        });

        mDaftar.setOnClickListener (view -> {
            Intent pindah1 = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(pindah1);
        });
    }
}
