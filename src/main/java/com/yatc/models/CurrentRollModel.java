package com.yatc.models;

public class CurrentRollModel {

    // FIELDS
    // long id
    private long id;
    // int rollCount
    private int rollCount = 0;
    // long die1Id
    private long die1Id;
    // long die2Id
    private long die2Id;
    // long die3Id
    private long die3Id;
    // long die4Id
    private long die4Id;
    // long die5Id
    private long die5Id;

    // GETTERS
    // long getId
    public long getId() {
        return id;
    }

    // int getRollCount
    public int getRollCount() {
        return rollCount;
    }

    // long getDie1Id
    public long getDie1Id() {
        return die1Id;
    }

    // long getDie2Id
    public long getDie2Id() {
        return die2Id;
    }

    // long getDie3Id
    public long getDie3Id() {
        return die3Id;
    }

    // long getDie4Id
    public long getDie4Id() {
        return die4Id;
    }

    // long getDie5Id
    public long getDie5Id() {
        return die5Id;
    }

    // SETTERS
    // void setId(long id)
    public void setId(long id) {
        this.id = id;
    }

    // void setRollCount(int rollCount)
    public void setRollCount(int rollCount) {
        this.rollCount = rollCount;
    }

    // void setDie1Id(long die1Id)
    public void setDie1Id(long die1Id) {
        this.die1Id = die1Id;
    }

    // long getDie2Id(long die2Id)
    public void setDie2Id(long die2Id) {
        this.die2Id = die2Id;
    }

    // long getDie3Id(long die3Id)
    public void setDie3Id(long die3Id) {
        this.die3Id = die3Id;
    }

    // long getDie4Id(long die4Id)
    public void setDie4Id(long die4Id) {
        this.die4Id = die4Id;
    }

    // long getDie5Id(long die5Id)
    public void setDie5Id(long die5Id) {
        this.die5Id = die5Id;
    }

    // HELPERS
    // void incrementRollCount()
    public void incrementRollCount() {
        if (rollCount < 3) {
            rollCount++;
        }
    }

}
