package com.example.eternalreturntracker.models.UserGameInfo;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class UserGame {

    @SerializedName("userNum")
    @Expose
    private Integer userNum;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("seasonId")
    @Expose
    private Integer seasonId;
    @SerializedName("matchingMode")
    @Expose
    private Integer matchingMode;
    @SerializedName("matchingTeamMode")
    @Expose
    private Integer matchingTeamMode;
    @SerializedName("characterNum")
    @Expose
    private Integer characterNum;
    @SerializedName("skinCode")
    @Expose
    private Integer skinCode;
    @SerializedName("characterLevel")
    @Expose
    private Integer characterLevel;
    @SerializedName("gameRank")
    @Expose
    private Integer gameRank;
    @SerializedName("playerKill")
    @Expose
    private Integer playerKill;
    @SerializedName("playerAssistant")
    @Expose
    private Integer playerAssistant;
    @SerializedName("monsterKill")
    @Expose
    private Integer monsterKill;
    @SerializedName("bestWeapon")
    @Expose
    private Integer bestWeapon;
    @SerializedName("bestWeaponLevel")
    @Expose
    private Integer bestWeaponLevel;
    @SerializedName("masteryLevel")
    @Expose
    private MasteryLevel masteryLevel;
    @SerializedName("equipment")
    @Expose
    private Equipment equipment;
    @SerializedName("versionMajor")
    @Expose
    private Integer versionMajor;
    @SerializedName("versionMinor")
    @Expose
    private Integer versionMinor;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("skillLevelInfo")
    @Expose
    private SkillLevelInfo skillLevelInfo;
    @SerializedName("skillOrderInfo")
    @Expose
    private SkillOrderInfo skillOrderInfo;
    @SerializedName("serverName")
    @Expose
    private String serverName;
    @SerializedName("maxHp")
    @Expose
    private Integer maxHp;
    @SerializedName("maxSp")
    @Expose
    private Integer maxSp;
    @SerializedName("attackPower")
    @Expose
    private Integer attackPower;
    @SerializedName("defense")
    @Expose
    private Integer defense;
    @SerializedName("hpRegen")
    @Expose
    private Double hpRegen;
    @SerializedName("spRegen")
    @Expose
    private Double spRegen;
    @SerializedName("attackSpeed")
    @Expose
    private Double attackSpeed;
    @SerializedName("moveSpeed")
    @Expose
    private Double moveSpeed;
    @SerializedName("outOfCombatMoveSpeed")
    @Expose
    private Double outOfCombatMoveSpeed;
    @SerializedName("sightRange")
    @Expose
    private Double sightRange;
    @SerializedName("attackRange")
    @Expose
    private Double attackRange;
    @SerializedName("criticalStrikeChance")
    @Expose
    private float criticalStrikeChance;
    @SerializedName("criticalStrikeDamage")
    @Expose
    private float criticalStrikeDamage;
    @SerializedName("coolDownReduction")
    @Expose
    private Integer coolDownReduction;
    @SerializedName("lifeSteal")
    @Expose
    private float lifeSteal;
    @SerializedName("amplifierToMonster")
    @Expose
    private Integer amplifierToMonster;
    @SerializedName("trapDamage")
    @Expose
    private Integer trapDamage;
    @SerializedName("gainExp")
    @Expose
    private Integer gainExp;
    @SerializedName("startDtm")
    @Expose
    private String startDtm;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("mmrBefore")
    @Expose
    private Integer mmrBefore;
    @SerializedName("killerUserNum")
    @Expose
    private Integer killerUserNum;
    @SerializedName("playTime")
    @Expose
    private Integer playTime;
    @SerializedName("watchTime")
    @Expose
    private Integer watchTime;
    @SerializedName("totalTime")
    @Expose
    private Integer totalTime;
    @SerializedName("botAdded")
    @Expose
    private Integer botAdded;
    @SerializedName("botRemain")
    @Expose
    private Integer botRemain;
    @SerializedName("restrictedAreaAccelerated")
    @Expose
    private Integer restrictedAreaAccelerated;
    @SerializedName("safeAreas")
    @Expose
    private Integer safeAreas;
    @SerializedName("killer")
    @Expose
    private String killer;
    @SerializedName("killDetail")
    @Expose
    private String killDetail;
    @SerializedName("causeOfDeath")
    @Expose
    private String causeOfDeath;
    @SerializedName("teamNumber")
    @Expose
    private Integer teamNumber;
    @SerializedName("preMade")
    @Expose
    private Integer preMade;
    @SerializedName("gainedNormalMmrKFactor")
    @Expose
    private Double gainedNormalMmrKFactor;
    @SerializedName("victory")
    @Expose
    private Integer victory;
    @SerializedName("craftUncommon")
    @Expose
    private Integer craftUncommon;
    @SerializedName("craftRare")
    @Expose
    private Integer craftRare;
    @SerializedName("craftEpic")
    @Expose
    private Integer craftEpic;
    @SerializedName("craftLegend")
    @Expose
    private Integer craftLegend;
    @SerializedName("damageToPlayer")
    @Expose
    private Integer damageToPlayer;
    @SerializedName("damageToPlayer_trap")
    @Expose
    private Integer damageToPlayerTrap;
    @SerializedName("damageToPlayer_basic")
    @Expose
    private Integer damageToPlayerBasic;
    @SerializedName("damageToPlayer_skill")
    @Expose
    private Integer damageToPlayerSkill;
    @SerializedName("damageToPlayer_direct")
    @Expose
    private Integer damageToPlayerDirect;
    @SerializedName("damageFromPlayer")
    @Expose
    private Integer damageFromPlayer;
    @SerializedName("damageFromPlayer_trap")
    @Expose
    private Integer damageFromPlayerTrap;
    @SerializedName("damageFromPlayer_basic")
    @Expose
    private Integer damageFromPlayerBasic;
    @SerializedName("damageFromPlayer_skill")
    @Expose
    private Integer damageFromPlayerSkill;
    @SerializedName("damageFromPlayer_direct")
    @Expose
    private Integer damageFromPlayerDirect;
    @SerializedName("damageToMonster")
    @Expose
    private Integer damageToMonster;
    @SerializedName("damageToMonster_trap")
    @Expose
    private Integer damageToMonsterTrap;
    @SerializedName("damageToMonster_basic")
    @Expose
    private Integer damageToMonsterBasic;
    @SerializedName("damageToMonster_skill")
    @Expose
    private Integer damageToMonsterSkill;
    @SerializedName("damageToMonster_direct")
    @Expose
    private Integer damageToMonsterDirect;
    @SerializedName("damageFromMonster")
    @Expose
    private Integer damageFromMonster;
    @SerializedName("killMonsters")
    @Expose
    private KillMonsters killMonsters;
    @SerializedName("healAmount")
    @Expose
    private Integer healAmount;
    @SerializedName("teamRecover")
    @Expose
    private Integer teamRecover;
    @SerializedName("protectAbsorb")
    @Expose
    private Integer protectAbsorb;
    @SerializedName("addSurveillanceCamera")
    @Expose
    private Integer addSurveillanceCamera;
    @SerializedName("addTelephotoCamera")
    @Expose
    private Integer addTelephotoCamera;
    @SerializedName("removeSurveillanceCamera")
    @Expose
    private Integer removeSurveillanceCamera;
    @SerializedName("removeTelephotoCamera")
    @Expose
    private Integer removeTelephotoCamera;
    @SerializedName("useHyperLoop")
    @Expose
    private Integer useHyperLoop;
    @SerializedName("useSecurityConsole")
    @Expose
    private Integer useSecurityConsole;
    @SerializedName("giveUp")
    @Expose
    private Integer giveUp;
    @SerializedName("teamSpectator")
    @Expose
    private Integer teamSpectator;
    @SerializedName("routeIdOfStart")
    @Expose
    private Integer routeIdOfStart;
    @SerializedName("placeOfStart")
    @Expose
    private String placeOfStart;
    @SerializedName("placeOfDeath")
    @Expose
    private String placeOfDeath;
    @SerializedName("killerCharacter")
    @Expose
    private String killerCharacter;
    @SerializedName("accountLevel")
    @Expose
    private Integer accountLevel;

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

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
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

    public Integer getCharacterNum() {
        return characterNum;
    }

    public void setCharacterNum(Integer characterNum) {
        this.characterNum = characterNum;
    }

    public Integer getSkinCode() {
        return skinCode;
    }

    public void setSkinCode(Integer skinCode) {
        this.skinCode = skinCode;
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(Integer characterLevel) {
        this.characterLevel = characterLevel;
    }

    public Integer getGameRank() {
        return gameRank;
    }

    public void setGameRank(Integer gameRank) {
        this.gameRank = gameRank;
    }

    public Integer getPlayerKill() {
        return playerKill;
    }

    public void setPlayerKill(Integer playerKill) {
        this.playerKill = playerKill;
    }

    public Integer getPlayerAssistant() {
        return playerAssistant;
    }

    public void setPlayerAssistant(Integer playerAssistant) {
        this.playerAssistant = playerAssistant;
    }

    public Integer getMonsterKill() {
        return monsterKill;
    }

    public void setMonsterKill(Integer monsterKill) {
        this.monsterKill = monsterKill;
    }

    public Integer getBestWeapon() {
        return bestWeapon;
    }

    public void setBestWeapon(Integer bestWeapon) {
        this.bestWeapon = bestWeapon;
    }

    public Integer getBestWeaponLevel() {
        return bestWeaponLevel;
    }

    public void setBestWeaponLevel(Integer bestWeaponLevel) {
        this.bestWeaponLevel = bestWeaponLevel;
    }

    public MasteryLevel getMasteryLevel() {
        return masteryLevel;
    }

    public void setMasteryLevel(MasteryLevel masteryLevel) {
        this.masteryLevel = masteryLevel;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Integer getVersionMajor() {
        return versionMajor;
    }

    public void setVersionMajor(Integer versionMajor) {
        this.versionMajor = versionMajor;
    }

    public Integer getVersionMinor() {
        return versionMinor;
    }

    public void setVersionMinor(Integer versionMinor) {
        this.versionMinor = versionMinor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public SkillLevelInfo getSkillLevelInfo() {
        return skillLevelInfo;
    }

    public void setSkillLevelInfo(SkillLevelInfo skillLevelInfo) {
        this.skillLevelInfo = skillLevelInfo;
    }

    public SkillOrderInfo getSkillOrderInfo() {
        return skillOrderInfo;
    }

    public void setSkillOrderInfo(SkillOrderInfo skillOrderInfo) {
        this.skillOrderInfo = skillOrderInfo;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
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

    public Double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(Double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public Double getOutOfCombatMoveSpeed() {
        return outOfCombatMoveSpeed;
    }

    public void setOutOfCombatMoveSpeed(Double outOfCombatMoveSpeed) {
        this.outOfCombatMoveSpeed = outOfCombatMoveSpeed;
    }

    public Double getSightRange() {
        return sightRange;
    }

    public void setSightRange(Double sightRange) {
        this.sightRange = sightRange;
    }

    public Double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(Double attackRange) {
        this.attackRange = attackRange;
    }

    public float getCriticalStrikeChance() {
        return criticalStrikeChance;
    }

    public void setCriticalStrikeChance(float criticalStrikeChance) { this.criticalStrikeChance = criticalStrikeChance; }

    public float getCriticalStrikeDamage() {
        return criticalStrikeDamage;
    }

    public void setCriticalStrikeDamage(float criticalStrikeDamage) {
        this.criticalStrikeDamage = criticalStrikeDamage;
    }

    public Integer getCoolDownReduction() {
        return coolDownReduction;
    }

    public void setCoolDownReduction(Integer coolDownReduction) {
        this.coolDownReduction = coolDownReduction;
    }

    public float getLifeSteal() {
        return lifeSteal;
    }

    public void setLifeSteal(Integer lifeSteal) {
        this.lifeSteal = lifeSteal;
    }

    public Integer getAmplifierToMonster() {
        return amplifierToMonster;
    }

    public void setAmplifierToMonster(Integer amplifierToMonster) {
        this.amplifierToMonster = amplifierToMonster;
    }

    public Integer getTrapDamage() {
        return trapDamage;
    }

    public void setTrapDamage(Integer trapDamage) {
        this.trapDamage = trapDamage;
    }

    public Integer getGainExp() {
        return gainExp;
    }

    public void setGainExp(Integer gainExp) {
        this.gainExp = gainExp;
    }

    public String getStartDtm() {
        return startDtm;
    }

    public void setStartDtm(String startDtm) {
        this.startDtm = startDtm;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getMmrBefore() {
        return mmrBefore;
    }

    public void setMmrBefore(Integer mmrBefore) {
        this.mmrBefore = mmrBefore;
    }

    public Integer getKillerUserNum() {
        return killerUserNum;
    }

    public void setKillerUserNum(Integer killerUserNum) {
        this.killerUserNum = killerUserNum;
    }

    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public Integer getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(Integer watchTime) {
        this.watchTime = watchTime;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public Integer getBotAdded() {
        return botAdded;
    }

    public void setBotAdded(Integer botAdded) {
        this.botAdded = botAdded;
    }

    public Integer getBotRemain() {
        return botRemain;
    }

    public void setBotRemain(Integer botRemain) {
        this.botRemain = botRemain;
    }

    public Integer getRestrictedAreaAccelerated() {
        return restrictedAreaAccelerated;
    }

    public void setRestrictedAreaAccelerated(Integer restrictedAreaAccelerated) {
        this.restrictedAreaAccelerated = restrictedAreaAccelerated;
    }

    public Integer getSafeAreas() {
        return safeAreas;
    }

    public void setSafeAreas(Integer safeAreas) {
        this.safeAreas = safeAreas;
    }

    public String getKiller() {
        return killer;
    }

    public void setKiller(String killer) {
        this.killer = killer;
    }

    public String getKillDetail() {
        return killDetail;
    }

    public void setKillDetail(String killDetail) {
        this.killDetail = killDetail;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public Integer getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(Integer teamNumber) {
        this.teamNumber = teamNumber;
    }

    public Integer getPreMade() {
        return preMade;
    }

    public void setPreMade(Integer preMade) {
        this.preMade = preMade;
    }

    public Double getGainedNormalMmrKFactor() {
        return gainedNormalMmrKFactor;
    }

    public void setGainedNormalMmrKFactor(Double gainedNormalMmrKFactor) {
        this.gainedNormalMmrKFactor = gainedNormalMmrKFactor;
    }

    public Integer getVictory() {
        return victory;
    }

    public void setVictory(Integer victory) {
        this.victory = victory;
    }

    public Integer getCraftUncommon() {
        return craftUncommon;
    }

    public void setCraftUncommon(Integer craftUncommon) {
        this.craftUncommon = craftUncommon;
    }

    public Integer getCraftRare() {
        return craftRare;
    }

    public void setCraftRare(Integer craftRare) {
        this.craftRare = craftRare;
    }

    public Integer getCraftEpic() {
        return craftEpic;
    }

    public void setCraftEpic(Integer craftEpic) {
        this.craftEpic = craftEpic;
    }

    public Integer getCraftLegend() {
        return craftLegend;
    }

    public void setCraftLegend(Integer craftLegend) {
        this.craftLegend = craftLegend;
    }

    public Integer getDamageToPlayer() {
        return damageToPlayer;
    }

    public void setDamageToPlayer(Integer damageToPlayer) {
        this.damageToPlayer = damageToPlayer;
    }

    public Integer getDamageToPlayerTrap() {
        return damageToPlayerTrap;
    }

    public void setDamageToPlayerTrap(Integer damageToPlayerTrap) {
        this.damageToPlayerTrap = damageToPlayerTrap;
    }

    public Integer getDamageToPlayerBasic() {
        return damageToPlayerBasic;
    }

    public void setDamageToPlayerBasic(Integer damageToPlayerBasic) {
        this.damageToPlayerBasic = damageToPlayerBasic;
    }

    public Integer getDamageToPlayerSkill() {
        return damageToPlayerSkill;
    }

    public void setDamageToPlayerSkill(Integer damageToPlayerSkill) {
        this.damageToPlayerSkill = damageToPlayerSkill;
    }

    public Integer getDamageToPlayerDirect() {
        return damageToPlayerDirect;
    }

    public void setDamageToPlayerDirect(Integer damageToPlayerDirect) {
        this.damageToPlayerDirect = damageToPlayerDirect;
    }

    public Integer getDamageFromPlayer() {
        return damageFromPlayer;
    }

    public void setDamageFromPlayer(Integer damageFromPlayer) {
        this.damageFromPlayer = damageFromPlayer;
    }

    public Integer getDamageFromPlayerTrap() {
        return damageFromPlayerTrap;
    }

    public void setDamageFromPlayerTrap(Integer damageFromPlayerTrap) {
        this.damageFromPlayerTrap = damageFromPlayerTrap;
    }

    public Integer getDamageFromPlayerBasic() {
        return damageFromPlayerBasic;
    }

    public void setDamageFromPlayerBasic(Integer damageFromPlayerBasic) {
        this.damageFromPlayerBasic = damageFromPlayerBasic;
    }

    public Integer getDamageFromPlayerSkill() {
        return damageFromPlayerSkill;
    }

    public void setDamageFromPlayerSkill(Integer damageFromPlayerSkill) {
        this.damageFromPlayerSkill = damageFromPlayerSkill;
    }

    public Integer getDamageFromPlayerDirect() {
        return damageFromPlayerDirect;
    }

    public void setDamageFromPlayerDirect(Integer damageFromPlayerDirect) {
        this.damageFromPlayerDirect = damageFromPlayerDirect;
    }

    public Integer getDamageToMonster() {
        return damageToMonster;
    }

    public void setDamageToMonster(Integer damageToMonster) {
        this.damageToMonster = damageToMonster;
    }

    public Integer getDamageToMonsterTrap() {
        return damageToMonsterTrap;
    }

    public void setDamageToMonsterTrap(Integer damageToMonsterTrap) {
        this.damageToMonsterTrap = damageToMonsterTrap;
    }

    public Integer getDamageToMonsterBasic() {
        return damageToMonsterBasic;
    }

    public void setDamageToMonsterBasic(Integer damageToMonsterBasic) {
        this.damageToMonsterBasic = damageToMonsterBasic;
    }

    public Integer getDamageToMonsterSkill() {
        return damageToMonsterSkill;
    }

    public void setDamageToMonsterSkill(Integer damageToMonsterSkill) {
        this.damageToMonsterSkill = damageToMonsterSkill;
    }

    public Integer getDamageToMonsterDirect() {
        return damageToMonsterDirect;
    }

    public void setDamageToMonsterDirect(Integer damageToMonsterDirect) {
        this.damageToMonsterDirect = damageToMonsterDirect;
    }

    public Integer getDamageFromMonster() {
        return damageFromMonster;
    }

    public void setDamageFromMonster(Integer damageFromMonster) {
        this.damageFromMonster = damageFromMonster;
    }

    public KillMonsters getKillMonsters() {
        return killMonsters;
    }

    public void setKillMonsters(KillMonsters killMonsters) {
        this.killMonsters = killMonsters;
    }

    public Integer getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(Integer healAmount) {
        this.healAmount = healAmount;
    }

    public Integer getTeamRecover() {
        return teamRecover;
    }

    public void setTeamRecover(Integer teamRecover) {
        this.teamRecover = teamRecover;
    }

    public Integer getProtectAbsorb() {
        return protectAbsorb;
    }

    public void setProtectAbsorb(Integer protectAbsorb) {
        this.protectAbsorb = protectAbsorb;
    }

    public Integer getAddSurveillanceCamera() {
        return addSurveillanceCamera;
    }

    public void setAddSurveillanceCamera(Integer addSurveillanceCamera) {
        this.addSurveillanceCamera = addSurveillanceCamera;
    }

    public Integer getAddTelephotoCamera() {
        return addTelephotoCamera;
    }

    public void setAddTelephotoCamera(Integer addTelephotoCamera) {
        this.addTelephotoCamera = addTelephotoCamera;
    }

    public Integer getRemoveSurveillanceCamera() {
        return removeSurveillanceCamera;
    }

    public void setRemoveSurveillanceCamera(Integer removeSurveillanceCamera) {
        this.removeSurveillanceCamera = removeSurveillanceCamera;
    }

    public Integer getRemoveTelephotoCamera() {
        return removeTelephotoCamera;
    }

    public void setRemoveTelephotoCamera(Integer removeTelephotoCamera) {
        this.removeTelephotoCamera = removeTelephotoCamera;
    }

    public Integer getUseHyperLoop() {
        return useHyperLoop;
    }

    public void setUseHyperLoop(Integer useHyperLoop) {
        this.useHyperLoop = useHyperLoop;
    }

    public Integer getUseSecurityConsole() {
        return useSecurityConsole;
    }

    public void setUseSecurityConsole(Integer useSecurityConsole) {
        this.useSecurityConsole = useSecurityConsole;
    }

    public Integer getGiveUp() {
        return giveUp;
    }

    public void setGiveUp(Integer giveUp) {
        this.giveUp = giveUp;
    }

    public Integer getTeamSpectator() {
        return teamSpectator;
    }

    public void setTeamSpectator(Integer teamSpectator) {
        this.teamSpectator = teamSpectator;
    }

    public Integer getRouteIdOfStart() {
        return routeIdOfStart;
    }

    public void setRouteIdOfStart(Integer routeIdOfStart) {
        this.routeIdOfStart = routeIdOfStart;
    }

    public String getPlaceOfStart() {
        return placeOfStart;
    }

    public void setPlaceOfStart(String placeOfStart) {
        this.placeOfStart = placeOfStart;
    }

    public String getPlaceOfDeath() {
        return placeOfDeath;
    }

    public void setPlaceOfDeath(String placeOfDeath) {
        this.placeOfDeath = placeOfDeath;
    }

    public String getKillerCharacter() {
        return killerCharacter;
    }

    public void setKillerCharacter(String killerCharacter) {
        this.killerCharacter = killerCharacter;
    }

    public Integer getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(Integer accountLevel) {
        this.accountLevel = accountLevel;
    }
}