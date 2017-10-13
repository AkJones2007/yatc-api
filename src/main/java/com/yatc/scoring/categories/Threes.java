package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;

public class Threes extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        int score = 0;

        for (int value : diceValues) {
            if (value == 3) {
                score += 3;
            }
        }

        return score;
    }

}
