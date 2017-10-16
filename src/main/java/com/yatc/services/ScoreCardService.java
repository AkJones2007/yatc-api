package com.yatc.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yatc.utils.Database;
import com.yatc.models.ScoreCardModel;

public class ScoreCardService {

    // FIELDS
    // database
    private Database database = new Database();

    // PUBLIC METHODS
    // findOne(long id)
    public ScoreCardModel findOne(long id) {
        try {
            ResultSet results = database.query("SELECT * FROM score_cards WHERE score_card_id=" + id);
            ScoreCardModel scoreCard = new ScoreCardModel();

            results.next();

            scoreCard.setId(results.getLong("score_card_id"));
            scoreCard.setYatcBonusCount(results.getInt("yatc_bonus_count"));

            int aces = results.getInt("aces");
            if (!results.wasNull()) {
                scoreCard.setAces(aces);
            }

            int twos = results.getInt("twos");
            if (!results.wasNull()) {
                scoreCard.setTwos(twos);
            }

            int threes = results.getInt("threes");
            if (!results.wasNull()) {
                scoreCard.setThrees(threes);
            }

            int fours = results.getInt("fours");
            if (!results.wasNull()) {
                scoreCard.setFours(fours);
            }

            int fives = results.getInt("fives");
            if (!results.wasNull()) {
                scoreCard.setFives(fives);
            }

            int sixes = results.getInt("sixes");
            if (!results.wasNull()) {
                scoreCard.setSixes(sixes);
            }

            int threeOfAKind = results.getInt("three_of_a_kind");
            if (!results.wasNull()) {
                scoreCard.setThreeOfAKind(threeOfAKind);
            }

            int fourOfAKind = results.getInt("four_of_a_kind");
            if (!results.wasNull()) {
                scoreCard.setFourOfAKind(fourOfAKind);
            }

            int fullHouse = results.getInt("full_house");
            if (!results.wasNull()) {
                scoreCard.setFullHouse(fullHouse);
            }

            int smallStraight = results.getInt("small_straight");
            if (!results.wasNull()) {
                scoreCard.setSmallStraight(smallStraight);
            }

            int largeStraight = results.getInt("large_straight");
            if (!results.wasNull()) {
                scoreCard.setLargeStraight(largeStraight);
            }

            int yatc = results.getInt("yatc");
            if (!results.wasNull()) {
                scoreCard.setYatc(yatc);
            }

            int chance = results.getInt("chance");
            if (!results.wasNull()) {
                scoreCard.setChance(chance);
            }

            return scoreCard;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // update(ScoreCardModel scoreCard)
    public void update(ScoreCardModel scoreCard) {
        if (scoreCard.hasAcesBeenSet()) {
            database.update("UPDATE score_cards SET aces=" + scoreCard.getAces() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasTwosBeenSet()) {
            database.update("UPDATE score_cards SET twos=" + scoreCard.getTwos() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasThreesBeenSet()) {
            database.update("UPDATE score_cards SET threes=" + scoreCard.getThrees() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasFoursBeenSet()) {
            database.update("UPDATE score_cards SET fours=" + scoreCard.getFours() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasFivesBeenSet()) {
            database.update("UPDATE score_cards SET fives=" + scoreCard.getFives() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasSixesBeenSet()) {
            database.update("UPDATE score_cards SET sixes=" + scoreCard.getSixes() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasThreeOfAKindBeenSet()) {
            database.update("UPDATE score_cards SET three_of_a_kind=" + scoreCard.getThreeOfAKind() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasFourOfAKindBeenSet()) {
            database.update("UPDATE score_cards SET four_of_a_kind=" + scoreCard.getFourOfAKind() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasFullHouseBeenSet()) {
            database.update("UPDATE score_cards SET full_house=" + scoreCard.getFullHouse() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasSmallStraightBeenSet()) {
            database.update("UPDATE score_cards SET small_straight=" + scoreCard.getSmallStraight() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasLargeStraightBeenSet()) {
            database.update("UPDATE score_cards SET large_straight=" + scoreCard.getLargeStraight() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasYatCBeenSet()) {
            database.update("UPDATE score_cards SET yatc=" + scoreCard.getYatc() + " WHERE score_card_id=" + scoreCard.getId());
        }

        if (scoreCard.hasChanceBeenSet()) {
            database.update("UPDATE score_cards SET chance=" + scoreCard.getChance() + " WHERE score_card_id=" + scoreCard.getId());
        }

        database.update("UPDATE score_cards SET yatc_bonus_count=" + scoreCard.getYatcBonusCount() + " WHERE score_card_id=" + scoreCard.getId());
    }

    // destroy(long id)
    public void destroy(long id) {
        database.update("DELETE FROM score_cards WHERE score_card_id=" + id);
    }

}
