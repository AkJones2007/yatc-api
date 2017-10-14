package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class LargeStraight extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnalyzer = new DiceValueAnalyzer(diceValues);

        if ((diceAnalyzer.hasValue(2) && diceAnalyzer.hasValue(3) && diceAnalyzer.hasValue(4) && diceAnalyzer.hasValue(5)) &&
            (diceAnalyzer.hasValue(1) || diceAnalyzer.hasValue(6))) {
            return 40;
        } else {
            return 0;
        }
    }

}
