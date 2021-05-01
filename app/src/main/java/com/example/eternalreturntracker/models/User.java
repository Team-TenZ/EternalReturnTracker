package com.example.eternalreturntracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User{
    // User class
    private int code;
    private String message;

    @SerializedName("user")
    @Expose
    private MoreUserDetails moreUserDetails;


    // Constructors

    public User(int code, MoreUserDetails moreUserDetails) {
        this.code = code;
        this.moreUserDetails = moreUserDetails;
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
}