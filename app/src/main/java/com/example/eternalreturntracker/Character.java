package com.example.eternalreturntracker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Character {
    String name;
    int maxHp;
    int maxSp;
    double moveSpeed;

    public Character(JSONObject jsonObject) throws JSONException {
        name = jsonObject.getString("name");
        maxHp = jsonObject.getInt("maxHp");
        maxSp = jsonObject.getInt("maxSp");
        moveSpeed = jsonObject.getDouble("moveSpeed");
    }

    public static List<Character> fromJsonArray(JSONArray characterJsonArray) throws JSONException {
        List<Character> characters = new ArrayList<>();
        for(int i = 0; i < characterJsonArray.length(); i++) {
            characters.add(new Character(characterJsonArray.getJSONObject(i)));
        }
        return characters;
    }
}
