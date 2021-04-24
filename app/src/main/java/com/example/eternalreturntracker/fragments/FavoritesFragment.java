package com.example.eternalreturntracker.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eternalreturntracker.BuildConfig;
import com.example.eternalreturntracker.R;
import com.example.eternalreturntracker.models.EternalReturnInterface;
import com.example.eternalreturntracker.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FavoritesFragment extends Fragment {

    public static final String BASE_URL = "https://open-api.bser.io";

    private TextView tvUser;


    public FavoritesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorites, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        tvUser = view.findViewById(R.id.tvUser);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EternalReturnInterface eternalReturnInterface = retrofit.create(EternalReturnInterface.class);
        Call<User> call = eternalReturnInterface.getUser("Silvision");
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(!response.isSuccessful()){
                    tvUser.setText("Code: " + response.code());
                    return;
                }

                User user = response.body();

                tvUser.append((CharSequence) user.getUser());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                    tvUser.setText(t.getMessage());
            }
        });

    }




}