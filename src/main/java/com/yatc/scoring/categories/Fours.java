package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;

public class Fours extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        int score = 0;

        for (int value : diceValues) {
            if (value == 4) {
                score += 4;
            }
        }

        return score;
    }

}
