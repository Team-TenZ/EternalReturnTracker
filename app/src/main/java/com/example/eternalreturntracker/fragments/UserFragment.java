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

import com.example.eternalreturntracker.MainActivity;
import com.example.eternalreturntracker.R;
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


public class UserFragment extends Fragment {

    private String searchedUsername;
    private TextView tvUsername;
    private TextView tvWinrate;
    private TextView tvTop5;
    private TextView tvAveragePlace;

    private ImageView ivProfile;
    private TextView tvRank;
    private TextView tvSeasonWins;

    private TextView tvGame1;
    private TextView tvGame2;
    private TextView tvGame3;
    private TextView tvGame4;
    private TextView tvGame5;


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



    public UserFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvUsername= view.findViewById(R.id.tvUsername);
        tvWinrate = view.findViewById(R.id.tvWinrate);
        tvTop5 = view.findViewById(R.id.tvTop5);
        tvAveragePlace = view.findViewById(R.id.tvAveragePlace);
        tvRank = view.findViewById(R.id.tvRank);
        tvSeasonWins = view.findViewById(R.id.tvSeasonWins);
        tvGame1 = view.findViewById(R.id.tvGame1);
        tvGame2 = view.findViewById(R.id.tvGame2);
        tvGame3 = view.findViewById(R.id.tvGame3);
        tvGame4 = view.findViewById(R.id.tvGame4);
        tvGame5 = view.findViewById(R.id.tvGame5);

        MainActivity activity = (MainActivity) getActivity();
        searchedUsername = activity.returnUsername();
        Log.i("USER FRAGMENT", searchedUsername);



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

        Call<User> call = eternalReturnInterface.getUser(searchedUsername);

        // FIRST CALL TO GET USERNAME AND USERNUM
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                if(response != null) {
                    if(response.body().getCode() == 404){
                        Log.i("USER FRAGMENT","FAILED");
                        return;
                    }

                    Log.i("USER FRAGMENT", new Gson().toJson(response.body(),User.class));
                    tvUsername.setText(response.body().getMoreUserDetails().getNickname());

                    // CALL TO GET USER STATS
                    Call<User> call2 = eternalReturnInterface.getUserStats(String.valueOf(response.body().getMoreUserDetails().getUserNum()),"0");
                    call2.enqueue(new Callback<User>() {
                        @Override
                        public void onResponse(Call<User> call2, Response<User> response2) {

                            if(response2 != null){
                                DecimalFormat precision = new DecimalFormat("0.0");

                                Log.i("USER FRAGMENT2", new Gson().toJson(response2.body(),User.class));

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
                                    Log.i("USER FRAGMENT2", "No MMR");
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
                        public void onFailure(Call<User> call2, Throwable t) {
                            Log.i("STUFF2", "onFailure for TRYING TO ENQUEUE THINGY", t);
                        }
                    });


                    // CALL TO GET USER GAMES
                    Call<User> call3 = eternalReturnInterface.getUserGames(String.valueOf(response.body().getMoreUserDetails().getUserNum()));
                    call3.enqueue(new Callback<User>() {
                        @Override
                        public void onResponse(Call<User> call3, Response<User> response3) {
                            if(response3 != null){
                                Log.i("USER FRAGMENT3", new Gson().toJson(response3.body(),User.class));

                                // COULD DO FOR LOOPS HERE


                                //FOR GAME 1
                                String gameRank = String.valueOf(response3.body().getUserGames().get(0).getGameRank()) + numberSuffix(response3.body().getUserGames().get(0).getGameRank());
                                Characters charNum = Characters.values()[(response3.body().getUserGames().get(0).getCharacterNum())-1];
                                int charLevel = response3.body().getUserGames().get(0).getCharacterLevel();
                                tvGame1.setText("Game 1 - (" + gameRank + ") - " + charNum + " Lv " + charLevel);

                                //FOR GAME 2
                                gameRank = String.valueOf(response3.body().getUserGames().get(1).getGameRank()) + numberSuffix(response3.body().getUserGames().get(1).getGameRank());
                                charNum = Characters.values()[(response3.body().getUserGames().get(1).getCharacterNum())-1];
                                charLevel = response3.body().getUserGames().get(1).getCharacterLevel();
                                tvGame2.setText("Game 2 - (" + gameRank + ") - " + charNum + " Lv " + charLevel);

                                //FOR GAME 3
                                gameRank = String.valueOf(response3.body().getUserGames().get(2).getGameRank()) + numberSuffix(response3.body().getUserGames().get(2).getGameRank());
                                charNum = Characters.values()[(response3.body().getUserGames().get(2).getCharacterNum())-1];
                                charLevel = response3.body().getUserGames().get(2).getCharacterLevel();
                                tvGame3.setText("Game 3 - (" + gameRank + ") - " + charNum + " Lv " + charLevel);

                                //FOR GAME 4
                                gameRank = String.valueOf(response3.body().getUserGames().get(3).getGameRank()) + numberSuffix(response3.body().getUserGames().get(3).getGameRank());
                                charNum = Characters.values()[(response3.body().getUserGames().get(3).getCharacterNum())-1];
                                charLevel = response3.body().getUserGames().get(3).getCharacterLevel();
                                tvGame4.setText("Game 4 - (" + gameRank + ") - " + charNum + " Lv " + charLevel);

                                //FOR GAME 5
                                gameRank = String.valueOf(response3.body().getUserGames().get(4).getGameRank()) + numberSuffix(response3.body().getUserGames().get(4).getGameRank());
                                charNum = Characters.values()[(response3.body().getUserGames().get(4).getCharacterNum())-1];
                                charLevel = response3.body().getUserGames().get(4).getCharacterLevel();
                                tvGame5.setText("Game 5 - (" + gameRank + ") - " + charNum + " Lv " + charLevel);

                            }
                        }

                        @Override
                        public void onFailure(Call<User> call3, Throwable t) {
                            Log.i("STUFF3", "onFailure for TRYING TO ENQUEUE THINGY", t);

                        }
                    });

                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.i("STUFF", "onFailure for TRYING TO ENQUEUE THINGY", t);
            }
        });

    }

    public String numberSuffix(int n){
        if(n >= 11 && n <= 13){
            return "th";
        }
        switch(n % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }


}

