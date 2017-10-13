package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;

public class Sixes extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        int score = 0;

        for (int value : diceValues) {
            if (value == 6) {
                score += 6;
            }
        }

        return score;
    }

}
