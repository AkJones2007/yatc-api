package com.yatc.services;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yatc.utils.Database;
import com.yatc.models.HighScoreModel;

public class HighScoreService {

    // FIELDS
    // database
    Database database = new Database();

    // PUBLIC METHODS
    // findByUserId(long id)
    public ArrayList<HighScoreModel> findByUserId(long id) {
        try {
            ResultSet results = database.query("SELECT * FROM high_scores WHERE user_id=" + id + " ORDER BY score DESC LIMIT 10");
            ArrayList<HighScoreModel> highScores = new ArrayList<HighScoreModel>();

            while (results.next()) {
                HighScoreModel highScore = new HighScoreModel();

                highScore.setId(results.getLong("high_score_id"));
                highScore.setUserId(results.getLong("user_id"));
                highScore.setGameId(results.getLong("game_id"));
                highScore.setScore(results.getInt("score"));
                highScore.setPlayerName(results.getString("player_name"));

                highScores.add(highScore);
            }

            return highScores;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // findOne(long id)
    public HighScoreModel findOne(long id) {
        try {
            ResultSet results = database.query("SELECT * FROM high_scores WHERE high_score_id=" + id);
            HighScoreModel highScore = new HighScoreModel();

            results.next();

            highScore.setId(results.getLong("high_score_id"));
            highScore.setUserId(results.getLong("user_id"));
            highScore.setGameId(results.getLong("game_id"));
            highScore.setScore(results.getInt("score"));
            highScore.setPlayerName(results.getString("player_name"));

            return highScore;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // create(HighScoreModel highScore)

    // destroy(long id)

}
