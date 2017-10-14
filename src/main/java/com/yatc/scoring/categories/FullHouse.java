package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class FullHouse extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnalyzer = new DiceValueAnalyzer(diceValues);

        if (diceAnalyzer.getHighestOccuranceCount() == 3 && diceAnalyzer.getUniqueValueCount() == 2) {
            return 25;
        } else {
            return 0;
        }
    }

}
