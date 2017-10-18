package com.yatc.messengers;

import com.yatc.messengers.Messenger;
import com.yatc.models.UserModel;

import org.json.JSONObject;
import org.json.JSONException;

public class UserMessenger extends Messenger {

    // render(UserModel user)
    public String render(UserModel user) throws JSONException {
        JSONObject json = new JSONObject();
        JSONObject userJSON = new JSONObject();

        userJSON.put("id", user.getId());
        userJSON.put("token", user.getToken());
        json.put("user", userJSON);

        return json.toString();
    }

    // parse(String rawJSON)
    public UserModel parse(String rawJSON) throws JSONException {
        JSONObject json = new JSONObject(rawJSON);
        JSONObject userJSON = json.getJSONObject("user");
        UserModel user = new UserModel();

        user.setId(userJSON.getLong("id"));
        user.setToken(userJSON.getString("token"));

        return user;
    }

}
