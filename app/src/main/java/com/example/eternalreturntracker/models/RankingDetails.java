package com.example.eternalreturntracker.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RankingDetails {

    @SerializedName("userNum")
    @Expose
    private Integer userNum;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("mmr")
    @Expose
    private Integer mmr;

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getMmr() {
        return mmr;
    }

    public void setMmr(Integer mmr) {
        this.mmr = mmr;
    }

}
