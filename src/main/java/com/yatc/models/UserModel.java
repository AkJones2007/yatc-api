package com.yatc.models;

import java.util.UUID;

public class UserModel {

    // FIELDS
    // long id
    private long id;
    // String token
    private String token;

    // GETTERS
    // long getId()
    public long getId() {
        return id;
    }

    // String getToken()
    public String getToken() {
        return token;
    }

    // SETTERS
    // void setId(long id)
    public void setId(long id) {
        this.id = id;
    }

    // void setToken()
    public void setToken() {
        UUID token = UUID.randomUUID();
        this.token = token.toString();
    }

    // void setToken(String token)
    public void setToken(String token) {
        this.token = token;
    }

}
