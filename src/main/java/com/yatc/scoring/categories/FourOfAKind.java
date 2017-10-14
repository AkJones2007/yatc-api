package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class FourOfAKind extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnalyzer = new DiceValueAnalyzer(diceValues);

        if (diceAnalyzer.getHighestOccuranceCount() >= 4) {
            return diceAnalyzer.getSum();
        } else {
            return 0;
        }
    }

}
