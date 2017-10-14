package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class SmallStraight extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnalyzer = new DiceValueAnalyzer(diceValues);

        if ((diceAnalyzer.hasValue(3) && diceAnalyzer.hasValue(4)) &&
            ((diceAnalyzer.hasValue(5) && (diceAnalyzer.hasValue(2) || diceAnalyzer.hasValue(6))) ||
             (diceAnalyzer.hasValue(2) && diceAnalyzer.hasValue(1)))) {
            return 30;
        } else {
            return 0;
        }
    }

}
