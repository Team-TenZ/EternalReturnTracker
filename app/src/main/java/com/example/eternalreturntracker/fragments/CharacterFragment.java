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
    private TextView tvUsername;
    private TextView tvWinrate;
    private TextView tvTop5;
    private TextView tvAveragePlace;

    private ImageView ivProfile;
    private TextView tvRank;
    private TextView tvSeasonWins;


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
        tvUsername= view.findViewById(R.id.tvCharacter);
        tvWinrate = view.findViewById(R.id.tvWinrate);
        tvTop5 = view.findViewById(R.id.tvTop5);
        tvAveragePlace = view.findViewById(R.id.tvAveragePlace);
        tvRank = view.findViewById(R.id.tvRank);
        tvSeasonWins = view.findViewById(R.id.tvSeasonWins);


        MainActivity activity = (MainActivity) getActivity();
        searchedCharacter = activity.returnCharacter();
        Log.i("CHARACTER FRAGMENT", searchedCharacter);



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

        Call<CharacterStat> call = eternalReturnInterface.getCharacter();
        call.enqueue(new Callback<CharacterStat>() {
            @Override
            public void onResponse(Call<CharacterStat> call, Response<CharacterStat> response) {


                // CALLS THE 2nd GET, TO GET USERSTATS AFTER GETTING THE USERNUM
                if(response != null) {
                    if(response.body().getCharacterCode() == 1){
                        Log.i("CHARACTER FRAGMENT","FAILED");
                        return;
                    }

                    Log.i("CHARACTER FRAGMENT", new Gson().toJson(response.body(),User.class));

                    Call<CharacterStat> call2 = eternalReturnInterface.getUserStats(String.valueOf(response.body().getMoreUserDetails().getUserNum()),"0");
                    call2.enqueue(new Callback<CharacterStat>() {
                        @Override
                        public void onResponse(Call<CharacterStat> call2, Response<CharacterStat> response2) {

                            if(response2 != null){
                                DecimalFormat precision = new DecimalFormat("0.0");

                                Log.i("CHARACTER FRAGMENT", new Gson().toJson(response2.body(),User.class));

                                //WINRATE
                                float winrate = ( (float) response2.body().getUserStats().get(0).getTotalWins() / response2.body().getUserStats().get(0).getTotalGames() * 100);
                                tvWinrate.setText("Win rate: " + precision.format(winrate) + "%");

                                //TOP5
                                float top5 = (float) (response2.body().getUserStats().get(0).getTop5()*100);
                                tvTop5.setText("Top 5 rate: " + precision.format(top5) + "%");

                                //AVERAGE PLACE
                                double averagePlace = response2.body().getUserStats().get(0).getAverageRank();
                                tvAveragePlace.setText("Average Place: #" + averagePlace);

                                //MMR
                                int rank = response2.body().getUserStats().get(0).getMmr();
                                if(rank == 0) {
                                    Log.i("USER FRAGMENT", "No MMR");
                                    tvRank.setText("No Rank");
                                }
                                else{
                                    tvRank.setText("MMR: " + rank);
                                }

                                //SEASON WINS
                                int seasonWins = response2.body().getUserStats().get(0).getTotalWins();
                                tvSeasonWins.setText("Season Wins: " + seasonWins + " wins");




                            }

                        }
                        @Override
                        public void onFailure(Call<CharacterStat> call, Throwable t) {
                            Log.i("STUFF2", "onFailure for TRYING TO ENQUEUE THINGY", t);
                        }
                    });

                }

            }

            @Override
            public void onFailure(Call<CharacterStat> call, Throwable t) {
                Log.i("STUFF", "onFailure for TRYING TO ENQUEUE THINGY", t);
            }
        });

    }


}