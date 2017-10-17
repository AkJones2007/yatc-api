package com.yatc.messengers;

import com.yatc.models.GameModel;

import org.json.JSONObject;
import org.json.JSONException;

public class GameMessenger extends Messenger {

    // render(GameModel game)
    public String render(GameModel game) throws JSONException {
        JSONObject json = new JSONObject();

        json.put("gameId", game.getId());
        json.put("turnCount", game.getTurnCount());
        json.put("isGameOver", game.getIsGameOver());
        json.put("playerName", game.getPlayerName());

        return json.toString();
    }

    // parse(String rawJSON)
    public GameModel parse(String rawJSON) throws JSONException {
        JSONObject json = new JSONObject(rawJSON);
        GameModel game = new GameModel();

        if (json.has("playerName")) {
            game.setPlayerName(json.getString("playerName"));
        }

        return game;
    }

}
