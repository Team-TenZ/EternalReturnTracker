package com.example.eternalreturntracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class UserStat {

    @SerializedName("seasonId")
    @Expose
    private Integer seasonId;
    @SerializedName("userNum")
    @Expose
    private Integer userNum;
    @SerializedName("matchingMode")
    @Expose
    private Integer matchingMode;
    @SerializedName("matchingTeamMode")
    @Expose
    private Integer matchingTeamMode;
    @SerializedName("mmr")
    @Expose
    private Integer mmr;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("rankSize")
    @Expose
    private Integer rankSize;
    @SerializedName("totalGames")
    @Expose
    private Integer totalGames;
    @SerializedName("totalWins")
    @Expose
    private Integer totalWins;
    @SerializedName("rankPercent")
    @Expose
    private Double rankPercent;
    @SerializedName("averageRank")
    @Expose
    private Double averageRank;
    @SerializedName("averageKills")
    @Expose
    private Double averageKills;
    @SerializedName("averageAssistants")
    @Expose
    private Double averageAssistants;
    @SerializedName("averageHunts")
    @Expose
    private Double averageHunts;
    @SerializedName("top1")
    @Expose
    private Double top1;
    @SerializedName("top2")
    @Expose
    private Double top2;
    @SerializedName("top3")
    @Expose
    private Double top3;
    @SerializedName("top5")
    @Expose
    private Double top5;
    @SerializedName("top7")
    @Expose
    private Double top7;


    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public Integer getMatchingMode() {
        return matchingMode;
    }

    public void setMatchingMode(Integer matchingMode) {
        this.matchingMode = matchingMode;
    }

    public Integer getMatchingTeamMode() {
        return matchingTeamMode;
    }

    public void setMatchingTeamMode(Integer matchingTeamMode) {
        this.matchingTeamMode = matchingTeamMode;
    }

    public Integer getMmr() {
        return mmr;
    }

    public void setMmr(Integer mmr) {
        this.mmr = mmr;
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

    public Integer getRankSize() {
        return rankSize;
    }

    public void setRankSize(Integer rankSize) {
        this.rankSize = rankSize;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }

    public Integer getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(Integer totalWins) {
        this.totalWins = totalWins;
    }

    public Double getRankPercent() {
        return rankPercent;
    }

    public void setRankPercent(Double rankPercent) {
        this.rankPercent = rankPercent;
    }

    public Double getAverageRank() {
        return averageRank;
    }

    public void setAverageRank(Double averageRank) {
        this.averageRank = averageRank;
    }

    public Double getAverageKills() {
        return averageKills;
    }

    public void setAverageKills(Double averageKills) {
        this.averageKills = averageKills;
    }

    public Double getAverageAssistants() {
        return averageAssistants;
    }

    public void setAverageAssistants(Double averageAssistants) {
        this.averageAssistants = averageAssistants;
    }

    public Double getAverageHunts() {
        return averageHunts;
    }

    public void setAverageHunts(Double averageHunts) {
        this.averageHunts = averageHunts;
    }

    public Double getTop1() {
        return top1;
    }

    public void setTop1(Double top1) {
        this.top1 = top1;
    }

    public Double getTop2() {
        return top2;
    }

    public void setTop2(Double top2) {
        this.top2 = top2;
    }

    public Double getTop3() {
        return top3;
    }

    public void setTop3(Double top3) {
        this.top3 = top3;
    }

    public Double getTop5() {
        return top5;
    }

    public void setTop5(Double top5) {
        this.top5 = top5;
    }

    public Double getTop7() {
        return top7;
    }

    public void setTop7(Double top7) {
        this.top7 = top7;
    }

}







