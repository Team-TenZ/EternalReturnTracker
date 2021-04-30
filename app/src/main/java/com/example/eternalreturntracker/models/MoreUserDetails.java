package com.example.eternalreturntracker.models;

public class MoreUserDetails{

    private int userNum;
    private String nickname;


    // Getters
    public int getUserNum() {
        return userNum;
    }

    public String getNickname() {
        return nickname;
    }


    public MoreUserDetails(int userNum, String nickname) {
        this.userNum = userNum;
        this.nickname = nickname;
    }
}