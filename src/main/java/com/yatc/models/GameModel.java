package com.yatc.models;

public class GameModel {

    // FIELDS
    // long id
    private long id;
    // long userId
    private long userId;
    // long currentRollId
    private long currentRollId;
    // long scoreCardId
    private long scoreCardId;
    // int turnCount
    private int turnCount = 0;
    // boolean isGameOver
    private boolean isGameOver = false;
    // String playerName
    private String playerName;

    // GETTERS
    // long getId
    public long getId() {
        return id;
    }

    // long getUserId
    public long getUserId() {
        return userId;
    }

    // long getCurrentRollId
    public long getCurrentRollId() {
        return currentRollId;
    }

    // long getScoreCardId
    public long getScoreCardId() {
        return scoreCardId;
    }

    // int getTurnCount
    public int getTurnCount() {
        return turnCount;
    }

    // boolean getIsGameOver
    public boolean getIsGameOver() {
        return isGameOver;
    }

    // String getPlayerName
    public String getPlayerName() {
        return playerName;
    }

    // SETTERS
    // void setId(long id)
    public void setId(long id) {
        this.id = id;
    }

    // void setUserId(long userId)
    public void setUserId(long userId) {
        this.userId = userId;
    }

    // void setCurrentRollId(long currentRollId)
    public void setCurrentRollId(long currentRollId) {
        this.currentRollId = currentRollId;
    }

    // void setScoreCardId(long scoreCardId)
    public void setScoreCardId(long scoreCardId) {
        this.scoreCardId = scoreCardId;
    }

    // void setTurnCount(int turnCount)
    public void setTurnCount(int turnCount) {
        this.turnCount = turnCount;
    }

    // void setIsGameOver(boolean isGameOver)
    public void setIsGameOver(boolean isGameOver) {
        this.isGameOver = isGameOver;
    }

    // void setPlayerName(String playerName)
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // HELPERS
    // void incrementTurnCount()
    public void incrementTurnCount() {
        if (turnCount < 13) {
            turnCount++;
        }

        isGameOver = (turnCount == 13);
    }

}
