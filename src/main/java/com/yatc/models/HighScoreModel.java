package com.yatc.models;

public class HighScoreModel {

    // FIELDS
    // id
    private long id;
    // userId
    private long userId;
    // gameId
    private long gameId;
    // score
    private int score;
    // playerName
    private String playerName;

    // GETTERS
    // getId
    public long getId() {
        return id;
    }

    // getUserId
    public long getUserId() {
        return userId;
    }

    // getGameId
    public long getGameId() {
        return gameId;
    }

    // getScore
    public int getScore() {
        return score;
    }

    // getPlayerName
    public String getPlayerName() {
        return playerName;
    }

    // SETTERS
    // setId
    public void setId(long id) {
        this.id = id;
    }

    // setUserId
    public void setUserId(long userId) {
        this.userId = userId;
    }

    // setGameId
    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    // setScore
    public void setScore(int score) {
        this.score = score;
    }

    // setPlayerName
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
