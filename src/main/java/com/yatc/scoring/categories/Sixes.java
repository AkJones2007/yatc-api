package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class Sixes extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnalyzer = new DiceValueAnalyzer(diceValues);

        return diceAnalyzer.getValueOccuranceCount(6) * 6;
    }

}
