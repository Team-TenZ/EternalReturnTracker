package com.example.eternalreturntracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.eternalreturntracker.fragments.CharacterFragment;
import com.example.eternalreturntracker.fragments.CharactersFragment;
import com.example.eternalreturntracker.fragments.FavoritesFragment;
import com.example.eternalreturntracker.fragments.RankingsFragment;
import com.example.eternalreturntracker.fragments.SearchFragment;
import com.example.eternalreturntracker.fragments.UserFragment;
import com.example.eternalreturntracker.models.EternalReturnInterface;
import com.example.eternalreturntracker.models.User;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity implements SearchFragment.OnDataPassFromSearch, CharactersFragment.OnDataPassFromSearch2{


    public static final String BASE_URL = "https://open-api.bser.io";
    public static final String REST_CONSUMER_KEY = BuildConfig.CONSUMER_KEY;

    final FragmentManager fragmentManager = getSupportFragmentManager();
    private BottomNavigationView bottomNavigationView;

    public String searchedUsername;
    public String searchedCharacter;




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
                        fragment = new SearchFragment();
                        break;
                    case R.id.action_rankings:
                        // TODO: update fragment
                        fragment = new RankingsFragment();
                        break;
                    case R.id.action_characters:
                        // TODO: update fragment
                        fragment = new CharactersFragment();
                        break;
                    //case R.id.action_favorites:
                    default:
                        // TODO: update fragment
                        fragment = new FavoritesFragment();
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;

            }
        });
        bottomNavigationView.setSelectedItemId((R.id.action_search));


    }

    @Override
    public void onDataPassFromSearch(CharSequence data){
        Log.i("MAIN ACTIVITY","hello " + data);
        searchedUsername = data.toString();
        fragmentManager.beginTransaction().replace(R.id.flContainer, new UserFragment()).commit();
    }

    public void onDataPassFromSearch2(CharSequence data){
        Log.i("MAIN ACTIVITY","hello " + data);
        searchedCharacter = data.toString();
        fragmentManager.beginTransaction().replace(R.id.flContainer, new CharacterFragment()).commit();
    }

    public String returnUsername(){
        return searchedUsername;
    }

    public String returnCharacter(){
        return searchedCharacter;
    }

}