package com.example.eternalreturntracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterStat {

    @SerializedName("characterCode")
    @Expose
    private Integer characterCode;
    @SerializedName("totalGames")
    @Expose
    private Integer totalGames;
    @SerializedName("usages")
    @Expose
    private Integer usages;
    @SerializedName("maxKillings")
    @Expose
    private Integer maxKillings;
    @SerializedName("top3")
    @Expose
    private Integer top3;
    @SerializedName("wins")
    @Expose
    private Integer wins;
    @SerializedName("top3Rate")
    @Expose
    private Integer top3Rate;
    @SerializedName("averageRank")
    @Expose
    private Integer averageRank;

    public Integer getCharacterCode() {
        return characterCode;
    }

    public void setCharacterCode(Integer characterCode) {
        this.characterCode = characterCode;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }

    public Integer getUsages() {
        return usages;
    }

    public void setUsages(Integer usages) {
        this.usages = usages;
    }

    public Integer getMaxKillings() {
        return maxKillings;
    }

    public void setMaxKillings(Integer maxKillings) {
        this.maxKillings = maxKillings;
    }

    public Integer getTop3() {
        return top3;
    }

    public void setTop3(Integer top3) {
        this.top3 = top3;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getTop3Rate() {
        return top3Rate;
    }

    public void setTop3Rate(Integer top3Rate) {
        this.top3Rate = top3Rate;
    }

    public Integer getAverageRank() {
        return averageRank;
    }

    public void setAverageRank(Integer averageRank) {
        this.averageRank = averageRank;
    }
}