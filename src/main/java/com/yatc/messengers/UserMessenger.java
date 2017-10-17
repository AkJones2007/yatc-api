package com.yatc.messengers;

import com.yatc.messengers.Messenger;
import com.yatc.models.UserModel;

import org.json.JSONObject;
import org.json.JSONException;

public class UserMessenger extends Messenger {

    // render(UserModel user)
    public String render(UserModel user) throws JSONException {
        JSONObject json = new JSONObject();

        json.put("id", user.getId());
        json.put("token", user.getToken());

        return json.toString();
    }

    // parse(String rawJSON)
    public UserModel parse(String rawJSON) throws JSONException {
        JSONObject json = new JSONObject(rawJSON);
        UserModel user = new UserModel();

        user.setId(json.getLong("id"));
        user.setToken(json.getString("token"));

        return user;
    }

}
