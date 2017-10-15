package com.yatc.models;

import com.yatc.scoring.categories.Aces;
import com.yatc.scoring.categories.Twos;
import com.yatc.scoring.categories.Threes;
import com.yatc.scoring.categories.Fours;
import com.yatc.scoring.categories.Fives;
import com.yatc.scoring.categories.Sixes;
import com.yatc.scoring.categories.ThreeOfAKind;
import com.yatc.scoring.categories.FourOfAKind;
import com.yatc.scoring.categories.FullHouse;
import com.yatc.scoring.categories.SmallStraight;
import com.yatc.scoring.categories.LargeStraight;
import com.yatc.scoring.categories.YatC;
import com.yatc.scoring.categories.Chance;

public class ScoreCardModel {

    // FIELDS
    // id
    private long id;
    // aces
    private Aces aces = new Aces();
    // twos
    private Twos twos = new Twos();
    // threes
    private Threes threes = new Threes();
    // fours
    private Fours fours = new Fours();
    // fives
    private Fives fives = new Fives();
    // sixes
    private Sixes sixes = new Sixes();
    // threeOfAKind
    private ThreeOfAKind threeOfAKind = new ThreeOfAKind();
    // fourOfAKind
    private FourOfAKind fourOfAKind = new FourOfAKind();
    // fullHouse
    private FullHouse fullHouse = new FullHouse();
    // smallStraight
    private SmallStraight smallStraight = new SmallStraight();
    // largeStraight
    private LargeStraight largeStraight = new LargeStraight();
    // yatc
    private YatC yatc = new YatC();
    // chance
    private Chance chance = new Chance();
    // yatcBonusCount
    private int yatcBonusCount = 0;

    // GETTERS
    // getId
    public long getId() {
        return id;
    }

    // getAces
    public int getAces() {
        return aces.getValue();
    }

    // getTwos
    public int getTwos() {
        return twos.getValue();
    }

    // getThrees
    public int getThrees() {
        return threes.getValue();
    }

    // getFours
    public int getFours() {
        return fours.getValue();
    }

    // getFives
    public int getFives() {
        return fives.getValue();
    }

    // getSixes
    public int getSixes() {
        return sixes.getValue();
    }

    // getThreeOfAKind
    public int getThreeOfAKind() {
        return threeOfAKind.getValue();
    }

    // getFourOfAKind
    public int getFourOfAKind() {
        return fourOfAKind.getValue();
    }

    // getFullHouse
    public int getFullHouse() {
        return fullHouse.getValue();
    }

    // getSmallStraight
    public int getSmallStraight() {
        return smallStraight.getValue();
    }

    // getLargeStraight
    public int getLargeStraight() {
        return largeStraight.getValue();
    }

    // getYatc
    public int getYatc() {
        return yatc.getValue();
    }

    // getChance
    public int getChance() {
        return chance.getValue();
    }

    // getYatcBonusCount
    public int getYatcBonusCount() {
        return yatcBonusCount;
    }

    // getUpperSectionSubTotal
    public int getUpperSectionSubTotal() {
        return (
            getAces() +
            getTwos() +
            getThrees() +
            getFours() +
            getFives() +
            getSixes()
        );
    }

    // getUpperSectionBonus
    public int getUpperSectionBonus() {
        if (getUpperSectionSubTotal() >= 63) {
            return 35;
        } else {
            return 0;
        }
    }

    // getUpperSectionTotal
    public int getUpperSectionTotal() {
        return getUpperSectionSubTotal() + getUpperSectionBonus();
    }

    // getLowerSectionTotal
    public int getLowerSectionTotal() {
        return (
            getThreeOfAKind() +
            getFourOfAKind() +
            getFullHouse() +
            getSmallStraight() +
            getLargeStraight() +
            getYatc() +
            getChance() +
            (getYatcBonusCount() * 100)
        );
    }

    // getGrandTotal
    public int getGrandTotal() {
        return getUpperSectionTotal() + getLowerSectionTotal();
    }

    // SETTERS
    // setId
    public void setId(long id) {
        this.id = id;
    }

    // setAces
    public void setAces(int[] diceValues) {
        aces.setValue(diceValues);
    }

    // setTwos
    public void setTwos(int[] diceValues) {
        twos.setValue(diceValues);
    }

    // setThrees
    public void setThrees(int[] diceValues) {
        threes.setValue(diceValues);
    }

    // setFours
    public void setFours(int[] diceValues) {
        fours.setValue(diceValues);
    }

    // setFives
    public void setFives(int[] diceValues) {
        fives.setValue(diceValues);
    }

    // setSixes
    public void setSixes(int[] diceValues) {
        sixes.setValue(diceValues);
    }

    // setThreeOfAKind
    public void setThreeOfAKind(int[] diceValues) {
        threeOfAKind.setValue(diceValues);
    }

    // setFourOfAKind
    public void setFourOfAKind(int[] diceValues) {
        fourOfAKind.setValue(diceValues);
    }

    // setFullHouse
    public void setFullHouse(int[] diceValues) {
        fullHouse.setValue(diceValues);
    }

    // setSmallStraight
    public void setSmallStraight(int[] diceValues) {
        smallStraight.setValue(diceValues);
    }

    // setLargeStraight
    public void setLargeStraight(int[] diceValues) {
        largeStraight.setValue(diceValues);
    }

    // setYatc
    public void setYatc(int[] diceValues) {
        yatc.setValue(diceValues);
    }

    // setChance
    public void setChance(int[] diceValues) {
        chance.setValue(diceValues);
    }

    // setYatcBonusCount
    public void setYatcBonusCount(int yatcBonusCount) {
        this.yatcBonusCount = yatcBonusCount;
    }

    // HELPERS
    // hasAcesBeenSet
    public boolean hasAcesBeenSet() {
        return aces.getHasBeenSet();
    }

    // hasTwosBeenSet
    public boolean hasTwosBeenSet() {
        return twos.getHasBeenSet();
    }

    // hasThreesBeenSet
    public boolean hasThreesBeenSet() {
        return threes.getHasBeenSet();
    }

    // hasFoursBeenSet
    public boolean hasFoursBeenSet() {
        return fours.getHasBeenSet();
    }

    // hasFivesBeenSet
    public boolean hasFivesBeenSet() {
        return fives.getHasBeenSet();
    }

    // hasSixesBeenSet
    public boolean hasSixesBeenSet() {
        return sixes.getHasBeenSet();
    }

    // hasThreeOfAKindBeenSet
    public boolean hasThreeOfAKindBeenSet() {
        return threeOfAKind.getHasBeenSet();
    }

    // hasFourOfAKindBeenSet
    public boolean hasFourOfAKindBeenSet() {
        return fourOfAKind.getHasBeenSet();
    }

    // hasFullHouseBeenSet
    public boolean hasFullHouseBeenSet() {
        return fullHouse.getHasBeenSet();
    }

    // hasSmallStraightBeenSet
    public boolean hasSmallStraightBeenSet() {
        return smallStraight.getHasBeenSet();
    }

    // hasLargeStraightBeenSet
    public boolean hasLargeStraightBeenSet() {
        return largeStraight.getHasBeenSet();
    }

    // hasYatCBeenSet
    public boolean hasYatCBeenSet() {
        return yatc.getHasBeenSet();
    }

    // hasChanceBeenSet
    public boolean hasChanceBeenSet() {
        return chance.getHasBeenSet();
    }

    // calculateAces
    public int calculateAces(int[] diceValues) {
        return aces.calculateValue(diceValues);
    }

    // calculateTwos
    public int calculateTwos(int[] diceValues) {
        return twos.calculateValue(diceValues);
    }

    // calculateThrees
    public int calculateThrees(int[] diceValues) {
        return threes.calculateValue(diceValues);
    }

    // calculateFours
    public int calculateFours(int[] diceValues) {
        return fours.calculateValue(diceValues);
    }

    // calculateFives
    public int calculateFives(int[] diceValues) {
        return fives.calculateValue(diceValues);
    }

    // calculateSixes
    public int calculateSixes(int[] diceValues) {
        return sixes.calculateValue(diceValues);
    }

    // calculateThreeOfAKind
    public int calculateThreeOfAKind(int[] diceValues) {
        return threeOfAKind.calculateValue(diceValues);
    }

    // calculateFourOfAKind
    public int calculateFourOfAKind(int[] diceValues) {
        return fourOfAKind.calculateValue(diceValues);
    }

    // calculateFullHouse
    public int calculateFullHouse(int[] diceValues) {
        return fullHouse.calculateValue(diceValues);
    }

    // calculateSmallStraight
    public int calculateSmallStraight(int[] diceValues) {
        return smallStraight.calculateValue(diceValues);
    }

    // calculateLargeStraight
    public int calculateLargeStraight(int[] diceValues) {
        return largeStraight.calculateValue(diceValues);
    }

    // calculateYatC
    public int calculateYatC(int[] diceValues) {
        return yatc.calculateValue(diceValues);
    }

    // calculateChance
    public int calculateChance(int[] diceValues) {
        return chance.calculateValue(diceValues);
    }

    // incrementYatcBonusCount
    public void incrementYatcBonusCount() {
        if (yatcBonusCount < 3) {
            yatcBonusCount++;
        }
    }

}
