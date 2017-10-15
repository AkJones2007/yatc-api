package com.yatc.models;

public class DieModel {

    // FIELDS
    // id
    private long id;
    // value
    private int value = 1;
    // isHeld
    private boolean isHeld = false;

    // GETTERS
    // getId()
    public long getId() {
        return id;
    }

    // getValue()
    public int getValue() {
        return value;
    }

    // getIsHeld()
    public boolean getIsHeld() {
        return isHeld;
    }

    // SETTERS
    // setId(long id)
    public void setId(long id) {
        this.id = id;
    }

    // setValue()
    public void setValue() {
        if (!isHeld) {
            value = (int) Math.ceil(Math.random() * 6);
        }
    }

    // setValue(int value)
    public void setValue(int value) {
        this.value = value;
    }

    // setIsHeld(boolean isHeld)
    public void setIsHeld(boolean isHeld) {
        this.isHeld = isHeld;
    }

}
