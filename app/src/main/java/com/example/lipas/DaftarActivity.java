package com.example.lipas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DaftarActivity extends AppCompatActivity {

    //atribut

    private TextView akun, nama, email, password, nomer;
    private EditText et_nama, et_mail, et_password, et_nomerHp;
    protected Button daftar;
    private ImageView eyes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_daftar);

        akun = (TextView) findViewById(R.id.akun);
        nama = (TextView) findViewById(R.id.nama);
        et_nama = (EditText) findViewById(R.id.et_nama);
        email = (TextView) findViewById(R.id.email);
        et_mail = (EditText) findViewById(R.id.et_email);
        password = (TextView) findViewById(R.id.pasword);
        et_password = (EditText) findViewById(R.id.et_pasword);
        nomer = (TextView) findViewById(R.id.nomer);
        et_nomerHp = (EditText) findViewById(R.id.et_nomer);
        daftar = (Button) findViewById(R.id.buatAkun);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(pindah);
            }
        });

    }

    public void masuk (View view){
        Intent pindahLogin = new Intent(DaftarActivity.this, LoginActivity.class);
        startActivity(pindahLogin);
    }
}
