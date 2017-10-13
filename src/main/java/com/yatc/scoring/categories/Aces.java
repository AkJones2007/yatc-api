package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;

public class Aces extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        int score = 0;

        for (int value : diceValues) {
            if (value == 1) {
                score += 1;
            }
        }

        return score;
    }

}
