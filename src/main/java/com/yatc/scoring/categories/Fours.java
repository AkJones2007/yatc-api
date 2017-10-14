package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class Fours extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnaluyzer = new DiceValueAnalyzer(diceValues);

        return diceAnaluyzer.getValueOccuranceCount(4) * 4;
    }

}
