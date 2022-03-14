package com.example.lipas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    //Deklarasi
    BottomNavigationView bottomNavigationView;

    //instanisasi
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.beranda:
                    fragment = new DashActivity();
                break;

                case R.id.notif:
                    fragment = new NotifActivity();
                    break;

                case R.id.history:
                    fragment = new HistoryActivity();
                    break;

                case R.id.profile:
                    //
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.layout_fragment, fragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_history_paket);

        bottomNavigationView = findViewById(R.id.footer);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}
