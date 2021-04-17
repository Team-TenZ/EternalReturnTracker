package com.example.eternalreturntracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById((R.id.bottomNavigation));

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()){
                    case R.id.action_search:
                        Toast.makeText(MainActivity.this, "Search!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_rankings:
                        Toast.makeText(MainActivity.this, "Rankings!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_characters:
                        Toast.makeText(MainActivity.this, "Characters!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_favorites:
                    default:
                        Toast.makeText(MainActivity.this, "Favorites!", Toast.LENGTH_SHORT).show();
                        break;


                }
                return true;

            }

        });

    }
}