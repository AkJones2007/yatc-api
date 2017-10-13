package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;

public class Twos extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        int score = 0;

        for (int value : diceValues) {
            if (value == 2) {
                score += 2;
            }
        }

        return score;
    }

}
