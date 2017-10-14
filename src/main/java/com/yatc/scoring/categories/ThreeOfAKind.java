package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import java.util.ArrayList;

public class ThreeOfAKind extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        ArrayList<Integer> uniqueValues = new ArrayList<Integer>();
        ArrayList<Integer> occurances = new ArrayList<Integer>();
        int highestOccuranceCount = 1;
        int score = 0;

        for (int value : diceValues) {
            if (uniqueValues.contains(value)) {
                int i = uniqueValues.indexOf(value);
                int occuranceCount = occurances.get(i) + 1;

                if (occuranceCount > highestOccuranceCount) {
                    highestOccuranceCount = occuranceCount;
                }

                occurances.set(i, occuranceCount);
            } else {
                uniqueValues.add(value);
                occurances.add(1);
            }
        }

        if (highestOccuranceCount >= 3) {
            for (int value : diceValues) {
                score += value;
            }
        }

        return score;
    }

}
