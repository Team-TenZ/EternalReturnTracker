package com.example.eternalreturntracker.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eternalreturntracker.BuildConfig;
import com.example.eternalreturntracker.R;
import com.example.eternalreturntracker.models.EternalReturnInterface;
import com.example.eternalreturntracker.models.User;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchFragment extends Fragment {

    public static final String BASE_URL = "https://open-api.bser.io";
    public static final String REST_CONSUMER_KEY = BuildConfig.CONSUMER_KEY;
    private EditText etSearch;
    private ImageView ivSearchIcon;
    private TextView tvUser;

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etSearch = view.findViewById(R.id.etSearch);
        ivSearchIcon = view.findViewById(R.id.ivSearchIcon);
        tvUser = view.findViewById(R.id.tvUser);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
          @Override
          public okhttp3.Response intercept(Chain chain) throws IOException {
              Request original = chain.request();

              Request request = original.newBuilder()
                      .addHeader("x-api-key", REST_CONSUMER_KEY)
                      .method(original.method(), original.body())
                      .build();

              return chain.proceed(request);
          }
        });


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
                    Log.i("STUFF", "onSuccess for TRYING TO ENQUEUE THINGY");
                    tvUser.setText("Code: " + response.code());
                    User user = response.body();
                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.i("STUFF", "onFailure for TRYING TO ENQUEUE THINGY");
            }
        });


    }
}