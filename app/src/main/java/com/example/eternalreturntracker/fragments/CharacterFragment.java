package com.example.eternalreturntracker.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eternalreturntracker.MainActivity;
import com.example.eternalreturntracker.R;
import com.example.eternalreturntracker.models.EternalReturnInterface;
import com.example.eternalreturntracker.models.User;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.eternalreturntracker.MainActivity.BASE_URL;
import static com.example.eternalreturntracker.MainActivity.REST_CONSUMER_KEY;


public class CharacterFragment extends Fragment {

    private String searchedCharacter;
    private TextView tvUsername;
    private TextView tvUserNum;


    public CharacterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvUsername= view.findViewById(R.id.tvUsername);
        tvUserNum = view.findViewById(R.id.tvUserNum);

        MainActivity activity = (MainActivity) getActivity();
        searchedCharacter = activity.returnCharacter();
        Log.i("USER FRAGMENT", searchedCharacter);



        // RETROFIT RELATED THINGS
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()
                        .addHeader("x-api-key", REST_CONSUMER_KEY)
                        .build();
                return chain.proceed(request);
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        EternalReturnInterface eternalReturnInterface = retrofit.create(EternalReturnInterface.class);

        Call<User> call = eternalReturnInterface.getUser(searchedCharacter);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                if(response != null) {
                    Log.i("STUFF", new Gson().toJson(response.body(),User.class));
                    Log.i("STUFF", response.body().getMoreUserDetails().getNickname());
                    tvUsername.setText(response.body().getMoreUserDetails().getNickname());
                    tvUserNum.setText(String.valueOf(response.body().getMoreUserDetails().getUserNum()));
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.i("STUFF", "onFailure for TRYING TO ENQUEUE THINGY", t);
            }
        });



    }



}