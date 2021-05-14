package com.example.eternalreturntracker.models;

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


    // Constructors

    public User(int code, MoreUserDetails moreUserDetails, List<UserStat> userStats) {
        this.code = code;
        this.moreUserDetails = moreUserDetails;
        this.userStats = userStats;
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

    public void setMoreUserDetails(MoreUserDetails moreUserDetails) {
        this.moreUserDetails = moreUserDetails;
    }

    public List<UserStat> getUserStats(){ return userStats; }

    public void setUserStats(List<UserStat> userStats){
        this.userStats = userStats;
    }

}