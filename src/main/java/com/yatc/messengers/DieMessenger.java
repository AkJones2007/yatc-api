package com.yatc.messengers;

import com.yatc.models.DieModel;

import org.json.JSONObject;
import org.json.JSONException;

public class DieMessenger extends Messenger {

    // render(DieModel die)
    public String render(DieModel die) throws JSONException {
        JSONObject json = new JSONObject();

        json.put("value", die.getValue());
        json.put("isHeld", die.getIsHeld());

        return json.toString();
    }

    // parse(String rawJSON)
    public DieModel parse(String rawJSON) throws JSONException {
        JSONObject json = new JSONObject(rawJSON);
        DieModel die = new DieModel();

        die.setValue(json.getInt("value"));
        die.setIsHeld(json.getBoolean("isHeld"));

        return die;
    }

}
