package com.example.eternalreturntracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.eternalreturntracker.fragments.CharactersFragment;
import com.example.eternalreturntracker.fragments.FavoritesFragment;
import com.example.eternalreturntracker.fragments.RankingsFragment;
import com.example.eternalreturntracker.fragments.SearchFragment;
import com.example.eternalreturntracker.models.EternalReturnInterface;
import com.example.eternalreturntracker.models.User;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    final FragmentManager fragmentManager = getSupportFragmentManager();
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
                        fragment = new SearchFragment();
                        break;
                    case R.id.action_rankings:
                        // TODO: update fragment
                        fragment = new RankingsFragment();
                        Toast.makeText(MainActivity.this, "Rankings!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_characters:
                        // TODO: update fragment
                        fragment = new CharactersFragment();
                        Toast.makeText(MainActivity.this, "Characters!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_favorites:
                    default:
                        // TODO: update fragment
                        fragment = new FavoritesFragment();
                        Toast.makeText(MainActivity.this, "Favorites!", Toast.LENGTH_SHORT).show();
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;

            }
        });
        bottomNavigationView.setSelectedItemId((R.id.action_search));






    }
}