package com.yatc.messengers;

import com.yatc.messengers.Messenger;
import com.yatc.models.CurrentRollModel;
import com.yatc.models.DieModel;
import com.yatc.services.DieService;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class CurrentRollMessenger extends Messenger {

    // render(CurrentRollModel currentRoll)
    public String render(CurrentRollModel currentRoll) throws JSONException {
        JSONObject json = new JSONObject();
        JSONArray dice = new JSONArray();
        DieService dieService = new DieService();
        DieMessenger dieMessenger = new DieMessenger();
        DieModel die1 = dieService.findOne(currentRoll.getDie1Id());
        DieModel die2 = dieService.findOne(currentRoll.getDie2Id());
        DieModel die3 = dieService.findOne(currentRoll.getDie3Id());
        DieModel die4 = dieService.findOne(currentRoll.getDie4Id());
        DieModel die5 = dieService.findOne(currentRoll.getDie5Id());
        JSONObject die1JSON = new JSONObject(dieMessenger.render(die1));
        JSONObject die2JSON = new JSONObject(dieMessenger.render(die2));
        JSONObject die3JSON = new JSONObject(dieMessenger.render(die3));
        JSONObject die4JSON = new JSONObject(dieMessenger.render(die4));
        JSONObject die5JSON = new JSONObject(dieMessenger.render(die5));

        dice.put(die1JSON);
        dice.put(die2JSON);
        dice.put(die3JSON);
        dice.put(die4JSON);
        dice.put(die5JSON);

        json.put("id", currentRoll.getId());
        json.put("rollCount", currentRoll.getRollCount());
        json.put("dice", dice);

        return json.toString();
    }

    // parse(String rawJSON)
    public CurrentRollModel parse(String rawJSON) throws JSONException {
        CurrentRollModel currentRoll = new CurrentRollModel();
        JSONObject json = new JSONObject(rawJSON);
        JSONArray dice = json.getJSONArray("dice");
        JSONObject die1 = dice.getJSONObject(0);
        JSONObject die2 = dice.getJSONObject(1);
        JSONObject die3 = dice.getJSONObject(2);
        JSONObject die4 = dice.getJSONObject(3);
        JSONObject die5 = dice.getJSONObject(4);

        currentRoll.setId(json.getLong("id"));
        currentRoll.setRollCount(json.getInt("rollCount"));
        currentRoll.setDie1Id(die1.getLong("id"));
        currentRoll.setDie2Id(die2.getLong("id"));
        currentRoll.setDie3Id(die3.getLong("id"));
        currentRoll.setDie4Id(die4.getLong("id"));
        currentRoll.setDie5Id(die5.getLong("id"));

        return currentRoll;
    }

}
