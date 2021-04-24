package com.example.eternalreturntracker.models;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EternalReturnInterface {


    @GET("/v1/user/nickname?query{username}")
    Call<User> getUser(@Path("username") String username);



}
