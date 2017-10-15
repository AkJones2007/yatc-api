package com.yatc.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yatc.utils.Database;
import com.yatc.models.GameModel;

public class GameService {

    // FIELDS
    // database
    private Database database = new Database();

    // PUBLIC METHODS
    // findOne(long id)
    public GameModel findOne(long id) {
        try {
            ResultSet results = database.query("SELECT game_id, user_id, current_roll_id, score_card_id, turn_count, is_game_over, player_name FROM games WHERE game_id=" + id);
            GameModel game = new GameModel();

            results.next();

            game.setId(results.getLong("game_id"));
            game.setUserId(results.getLong("user_id"));
            game.setCurrentRollId(results.getLong("current_roll_id"));
            game.setScoreCardId(results.getLong("score_card_id"));
            game.setTurnCount(results.getInt("turn_count"));
            game.setIsGameOver(results.getBoolean("is_game_over"));
            game.setPlayerName(results.getString("player_name"));

            return game;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // findOneByUserId(long userId)
    public GameModel findOneByUserId(long userId) {
        try {
            ResultSet results = database.query("SELECT game_id, user_id, current_roll_id, score_card_id, turn_count, is_game_over, player_name FROM games WHERE user_id=" + userId);
            GameModel game = new GameModel();

            results.next();

            game.setId(results.getLong("game_id"));
            game.setUserId(results.getLong("user_id"));
            game.setCurrentRollId(results.getLong("current_roll_id"));
            game.setScoreCardId(results.getLong("score_card_id"));
            game.setTurnCount(results.getInt("turn_count"));
            game.setIsGameOver(results.getBoolean("is_game_over"));
            game.setPlayerName(results.getString("player_name"));

            return game;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // create(GameModel game)
    public void create(GameModel game) {
        database.update("INSERT INTO games (user_id, player_name) VALUES (" + game.getUserId() + ", '" + game.getPlayerName() + "')");
    }

    // update(GameModel game)
    public void update(GameModel game) {
        database.update("UPDATE games SET turn_count=" + game.getTurnCount() + ", is_game_over=" + game.getIsGameOver() + " WHERE game_id=" + game.getId());
    }

    // destroy(long id)
    public void destroy(long id) {
        database.update("DELETE FROM games WHERE game_id=" + id);
    }

}
