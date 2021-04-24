package com.example.eternalreturntracker.models;

import com.example.eternalreturntracker.BuildConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EternalReturnInterface {

    @GET("/v1/user/nickname?query=")
    Call<User> getUser(@Query("username") String username);



}
