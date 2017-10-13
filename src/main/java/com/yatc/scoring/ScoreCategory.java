package com.yatc.scoring;

public abstract class ScoreCategory {

    // FIELDS
    // int value
    private int value = 0;
    // boolean hasBeenSet
    private boolean hasBeenSet = false;

    // GETTERS
    // int getValue()
    public int getValue() {
        return value;
    }

    // boolean getHasBeenSet()
    public boolean getHasBeenSet() {
        return hasBeenSet;
    }

    // SETTERS
    // void setValue(int[] diceValues)
    public void setValue(int[] diceValues) {
        if (!hasBeenSet) {
            value = calculateValue(diceValues);
            hasBeenSet = true;
        }
    }

    // HELPERS
    // abstract int calculateValue(int[] diceValues)
    public abstract int calculateValue(int[] diceValues);

}
