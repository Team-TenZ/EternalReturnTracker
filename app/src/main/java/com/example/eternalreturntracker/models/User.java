package com.example.eternalreturntracker.models;

import com.example.eternalreturntracker.models.UserGameInfo.UserGame;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User{
    // User class
    private int code;
    private String message;

    @SerializedName("user")
    @Expose
    private MoreUserDetails moreUserDetails;

    @SerializedName("userStats")
    @Expose
    private List<UserStat> userStats;

    @SerializedName("userGames")
    @Expose
    private List<UserGame> userGames;


    // Constructors

    public User(int code, MoreUserDetails moreUserDetails, List<UserStat> userStats, List<UserGame> userGames) {
        this.code = code;
        this.moreUserDetails = moreUserDetails;
        this.userStats = userStats;
        this.userGames = userGames;
    }


    // Getters and Setters

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MoreUserDetails getMoreUserDetails() {
        return moreUserDetails;
    }
    public void setMoreUserDetails(MoreUserDetails moreUserDetails) { this.moreUserDetails = moreUserDetails; }


    public List<UserStat> getUserStats(){ return userStats; }
    public void setUserStats(List<UserStat> userStats){
        this.userStats = userStats;
    }


    public List<UserGame> getUserGames(){ return userGames; }
    public void setUserGames(List<UserGame> userGames) { this.userGames = userGames; }


}