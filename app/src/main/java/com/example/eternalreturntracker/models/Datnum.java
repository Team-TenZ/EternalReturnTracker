package com.example.eternalreturntracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datnum {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("maxHp")
    @Expose
    private Integer maxHp;
    @SerializedName("maxSp")
    @Expose
    private Integer maxSp;
    @SerializedName("initExtraPoint")
    @Expose
    private Integer initExtraPoint;
    @SerializedName("maxExtraPoint")
    @Expose
    private Integer maxExtraPoint;
    @SerializedName("attackPower")
    @Expose
    private Integer attackPower;
    @SerializedName("defense")
    @Expose
    private Integer defense;
    @SerializedName("criticalStrikeChance")
    @Expose
    private Integer criticalStrikeChance;
    @SerializedName("hpRegen")
    @Expose
    private Double hpRegen;
    @SerializedName("spRegen")
    @Expose
    private Double spRegen;
    @SerializedName("attackSpeed")
    @Expose
    private Double attackSpeed;
    @SerializedName("attackSpeedLimit")
    @Expose
    private Double attackSpeedLimit;
    @SerializedName("attackSpeedMin")
    @Expose
    private Integer attackSpeedMin;
    @SerializedName("moveSpeed")
    @Expose
    private Double moveSpeed;
    @SerializedName("sightRange")
    @Expose
    private Integer sightRange;
    @SerializedName("radius")
    @Expose
    private Double radius;
    @SerializedName("uiHeight")
    @Expose
    private Double uiHeight;
    @SerializedName("resource")
    @Expose
    private String resource;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxHp = maxHp;
    }

    public Integer getMaxSp() {
        return maxSp;
    }

    public void setMaxSp(Integer maxSp) {
        this.maxSp = maxSp;
    }

    public Integer getInitExtraPoint() {
        return initExtraPoint;
    }

    public void setInitExtraPoint(Integer initExtraPoint) {
        this.initExtraPoint = initExtraPoint;
    }

    public Integer getMaxExtraPoint() {
        return maxExtraPoint;
    }

    public void setMaxExtraPoint(Integer maxExtraPoint) {
        this.maxExtraPoint = maxExtraPoint;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getCriticalStrikeChance() {
        return criticalStrikeChance;
    }

    public void setCriticalStrikeChance(Integer criticalStrikeChance) {
        this.criticalStrikeChance = criticalStrikeChance;
    }

    public Double getHpRegen() {
        return hpRegen;
    }

    public void setHpRegen(Double hpRegen) {
        this.hpRegen = hpRegen;
    }

    public Double getSpRegen() {
        return spRegen;
    }

    public void setSpRegen(Double spRegen) {
        this.spRegen = spRegen;
    }

    public Double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Double getAttackSpeedLimit() {
        return attackSpeedLimit;
    }

    public void setAttackSpeedLimit(Double attackSpeedLimit) {
        this.attackSpeedLimit = attackSpeedLimit;
    }

    public Integer getAttackSpeedMin() {
        return attackSpeedMin;
    }

    public void setAttackSpeedMin(Integer attackSpeedMin) {
        this.attackSpeedMin = attackSpeedMin;
    }

    public Double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(Double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public Integer getSightRange() {
        return sightRange;
    }

    public void setSightRange(Integer sightRange) {
        this.sightRange = sightRange;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getUiHeight() {
        return uiHeight;
    }

    public void setUiHeight(Double uiHeight) {
        this.uiHeight = uiHeight;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

}
