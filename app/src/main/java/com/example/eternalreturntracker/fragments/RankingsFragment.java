package com.example.eternalreturntracker.fragments;

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
import com.example.eternalreturntracker.models.Ranking;

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

public class RankingsFragment extends Fragment {

    private TextView tvUser1;
    private TextView tvUser2;
    private TextView tvUser3;
    private TextView tvUser4;
    private TextView tvUser5;
    private TextView tvUser6;
    private TextView tvUser7;
    private TextView tvUser8;
    private TextView tvUser9;
    private TextView tvUser10;


    public RankingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rankings, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvUser1 = view.findViewById(R.id.tvNumber1);
        tvUser2 = view.findViewById(R.id.tvNumber2);
        tvUser3 = view.findViewById(R.id.tvNumber3);
        tvUser4 = view.findViewById(R.id.tvNumber4);
        tvUser5 = view.findViewById(R.id.tvNumber5);
        tvUser6 = view.findViewById(R.id.tvNumber6);
        tvUser7 = view.findViewById(R.id.tvNumber7);
        tvUser8 = view.findViewById(R.id.tvNumber8);
        tvUser9 = view.findViewById(R.id.tvNumber9);
        tvUser10 = view.findViewById(R.id.tvNumber10);

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

        Call<Ranking> call1 = eternalReturnInterface.getTopRanks("1", "1");

        call1.enqueue(new Callback<Ranking>() {
            @Override
            public void onResponse(Call<Ranking> call, Response<Ranking> response) {
                if(response != null){
                    tvUser1.setText("1 - " + response.body().getTopRanks().get(0).getNickname());
                    tvUser2.setText("2 - " + response.body().getTopRanks().get(1).getNickname());
                    tvUser3.setText("3 - " + response.body().getTopRanks().get(2).getNickname());
                    tvUser4.setText("4 - " + response.body().getTopRanks().get(3).getNickname());
                    tvUser5.setText("5 - " + response.body().getTopRanks().get(4).getNickname());
                    tvUser6.setText("6 - " + response.body().getTopRanks().get(5).getNickname());
                    tvUser7.setText("7 - " + response.body().getTopRanks().get(6).getNickname());
                    tvUser8.setText("8 - " + response.body().getTopRanks().get(7).getNickname());
                    tvUser9.setText("9 - " + response.body().getTopRanks().get(8).getNickname());
                    tvUser10.setText("10 - " + response.body().getTopRanks().get(9).getNickname());

                }
            }

            @Override
            public void onFailure(Call<Ranking> call, Throwable t) {
                Log.i("RankingsFragment", "onFailure for TRYING TO request call", t);
            }
        });
    }
}
