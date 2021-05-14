package com.example.eternalreturntracker.models;

import org.json.JSONObject;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EternalReturnInterface {

    @GET("/v1/user/nickname")
    Call<User> getUser(@Query("query") String username);

    @GET("/v1/user/stats/{userNum}/{seasonId}")
    Call<User> getUserStats(@Path("userNum") String userNum, @Path("seasonId") String seasonId);

    @GET("/v1/data/Character")
    Call<CharacterStat> getCharacter();
}
