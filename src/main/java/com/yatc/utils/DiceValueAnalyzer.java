package com.yatc.utils;

import java.util.ArrayList;

public class DiceValueAnalyzer {

    // FIELDS
    // ArrayList<Integer> uniqueValues
    private ArrayList<Integer> uniqueValues = new ArrayList<Integer>();
    // ArrayList<Integer> occurances
    private ArrayList<Integer> occurances = new ArrayList<Integer>();
    // int values
    private int[] values;

    // CONSTRUCTOR
    public DiceValueAnalyzer(int[] diceValues) {
        values = diceValues;

        for (int value : values) {
            if (uniqueValues.contains(value)) {
                int index = uniqueValues.indexOf(value);
                int occuranceCount = occurances.get(index) + 1;

                occurances.set(index, occuranceCount);
            } else {
                uniqueValues.add(value);
                occurances.add(1);
            }
        }
    }

    // PUBLIC METHODS
    // boolean hasValue(int value)
    public boolean hasValue(int value) {
        return uniqueValues.contains(value);
    }

    // int getSum()
    public int getSum() {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }

    // int getUniqueValueCount()
    public int getUniqueValueCount() {
        return uniqueValues.size();
    }

    // int getHighestOccuranceCount()
    public int getHighestOccuranceCount() {
        int highestOccuranceCount = 1;

        for (int occuranceCount : occurances) {
            if (occuranceCount > highestOccuranceCount) {
                highestOccuranceCount = occuranceCount;
            }
        }

        return highestOccuranceCount;
    }

    // int getValueOccuranceCount(int value)
    public int getValueOccuranceCount(int value) {
        if (uniqueValues.contains(value)) {
            int index = uniqueValues.indexOf(value);
            return occurances.get(index);
        } else {
            return 0;
        }
    }

}
