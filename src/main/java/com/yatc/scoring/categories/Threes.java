package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class Threes extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnalyzer = new DiceValueAnalyzer(diceValues);

        return diceAnalyzer.getValueOccuranceCount(3) * 3;
    }

}
