package com.yatc.scoring.categories;

import com.yatc.scoring.ScoreCategory;
import com.yatc.utils.DiceValueAnalyzer;

public class Twos extends ScoreCategory {

    public int calculateValue(int[] diceValues) {
        DiceValueAnalyzer diceAnaluyzer = new DiceValueAnalyzer(diceValues);

        return diceAnaluyzer.getValueOccuranceCount(2) * 2;
    }

}
