package com.yatc.messengers;

import org.json.JSONObject;
import org.json.JSONException;

public class Messenger {

    // renderSuccessMessage(String text)
    public String renderSuccessMessage(String text) throws JSONException {
        JSONObject json = new JSONObject();
        JSONObject message = new JSONObject();

        message.put("success", text);
        json.put("message", message);

        return json.toString();
    }

    // renderErrorMessage(Exception exception)
    public String renderErrorMessage(Exception exception) throws JSONException {
        JSONObject json = new JSONObject();
        JSONObject message = new JSONObject();

        message.put("error", exception.getMessage());
        json.put("message", message);

        return json.toString();
    }

}
