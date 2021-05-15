package com.example.eternalreturntracker.models;


import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Ranking {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("topRanks")
    @Expose
    private List<RankingDetails> topRanks = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<RankingDetails> getTopRanks() {
        return topRanks;
    }

    public void setTopRanks(List<RankingDetails> topRanks) {
        this.topRanks = topRanks;
    }

}
