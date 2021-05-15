package com.example.eternalreturntracker.fragments;

import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eternalreturntracker.Character;
import com.example.eternalreturntracker.MainActivity;
import com.example.eternalreturntracker.R;
import com.example.eternalreturntracker.models.CharacterStat;
import com.example.eternalreturntracker.models.EternalReturnInterface;
import com.example.eternalreturntracker.models.User;
import com.example.eternalreturntracker.models.UserGameInfo.Test;
import com.google.gson.Gson;

import java.io.IOException;
import java.text.DecimalFormat;

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
    private int characterCode;
    private TextView tvCharacter;
    private TextView tvHp;
    private TextView tvSp;
    private TextView tvHpRegen;
    private TextView tvSpRegen;
    private TextView tvAtk;
    private TextView tvDef;
    private TextView tvAtkSpd;
    private TextView tvSpd;
    private ImageView ivProfile;

    public enum Characters{
        Jackie,
        Aya,
        Fiora,
        Magnus,
        Zahir,
        Nadine,
        Hyunwoo,
        Hart,
        Isol,
        LiDailin,
        Yuki,
        Hyejin,
        Xiukai,
        Chiara,
        Sissela,
        Silvia,
        Adriana,
        Shoichi,
        Emma,
        Lenox,
        Rozzi,
        Luke,
        Cathy,
        Adela,
        Bernice,
        Barbara,
        Alex,
        Sua,
        Leon
    }

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

        tvCharacter= view.findViewById(R.id.tvCharacter);
        tvHp = view.findViewById(R.id.tvHp);
        tvSp = view.findViewById(R.id.tvSp);
        tvHpRegen = view.findViewById(R.id.tvHpRegen);
        tvSpRegen = view.findViewById(R.id.tvSpRegen);
        tvAtk = view.findViewById(R.id.tvAtk);
        tvAtkSpd = view.findViewById(R.id.tvAtkSpd);
        tvSpd = view.findViewById(R.id.tvSpd);

        MainActivity activity = (MainActivity) getActivity();
        searchedCharacter = activity.returnCharacter();
        Log.i("CHARACTER FRAGMENT", searchedCharacter);
        Test t1 = new Test(searchedCharacter);
        t1.characterFun();
        characterCode = t1.getNumber();
        tvCharacter.setText(searchedCharacter);


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

        final EternalReturnInterface eternalReturnInterface = retrofit.create(EternalReturnInterface.class);

        Call<Character> call = eternalReturnInterface.getCharacter();
        call.enqueue(new Callback<Character>() {
            @Override
            public void onResponse(Call<Character> call, Response<Character> response) {

                if (response != null) {
                    if (characterCode == 0) {
                        Log.i("CHARACTER FRAGMENT", "FAILED");
                        return;
                    }

                    Log.i("CHARACTER FRAGMENT", new Gson().toJson(response.body(), Character.class));
                    tvHp.setText(response.body().getCharacterStats().get(characterCode-1).getMaxHp());


                }
            }

            @Override
            public void onFailure(Call<Character> call, Throwable t) {
                Log.i("STUFF", "onFailure for TRYING TO ENQUEUE THINGY", t);
            }
        });
    }
}