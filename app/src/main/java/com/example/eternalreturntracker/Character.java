package com.example.eternalreturntracker;

import com.example.eternalreturntracker.models.CharacterStat;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Character{
    // User class
    private int code;
    private String message;

    @SerializedName("characterStats")
    @Expose
    private List<CharacterStat> characterStats;


    // Constructors

    public Character(int code, List<CharacterStat> characterStats) {
        this.code = code;
        this.characterStats = characterStats;
    }


    // Getters and Setters

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<CharacterStat> getCharacterStats(){ return characterStats; }

    public void setUserStats(List<CharacterStat> characterStats){
        this.characterStats = characterStats;
    }

}