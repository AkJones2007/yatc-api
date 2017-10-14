package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class YatC extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnalyzer = new DiceValueAnalyzer(diceValues);

        if (diceAnalyzer.getHighestOccuranceCount() == 5) {
            return 50;
        } else {
            return 0;
        }
    }

}
