package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;

public class Fives extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        int score = 0;

        for (int value : diceValues) {
            if (value == 5) {
                score += 5;
            }
        }

        return score;
    }

}
