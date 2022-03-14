package com.example.lipas;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class checkoutActivity extends AppCompatActivity {

    public static Button confirm;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_checkout);


        confirm = findViewById(R.id.btn_konfirmasi);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // penggunaan toast
                Toast.makeText(getApplicationContext(),"Pesanan Anda masuk tahap selanjutnya", Toast.LENGTH_SHORT).show();
                //Toast.makeText(this ,"Pesanan Anda masuk tahap selanjutnya", Toast.LENGTH_SHORT).show();


            }
        });

    }

    public void RadiobtnPilih (View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_dana:
                if (checked)
                    // role
                break;
            case R.id.radio_ovo:
                if (checked)
                    //body
                break;
            case R.id.radio_master:
                if (checked)
                    //body
                break;



        }
    }
}
