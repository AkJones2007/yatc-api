package com.yatc.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yatc.utils.Database;
import com.yatc.models.UserModel;

public class UserService {

    // FIELDS
    // database
    private Database database = new Database();

    // PUBLIC METHODS
    // findOne(long id)
    public UserModel findOne(long id) {
        try {
            ResultSet results = database.query("SELECT user_id, token FROM users WHERE user_id=" + id);
            UserModel user = new UserModel();

            results.next();

            user.setId(results.getLong("user_id"));
            user.setToken(results.getString("token"));

            return user;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // findOneByToken(String token)
    public UserModel findOneByToken(String token) {
        try {
            ResultSet results = database.query("SELECT user_id, token FROM users WHERE token='" + token + "'");
            UserModel user = new UserModel();

            results.next();

            user.setId(results.getLong("user_id"));
            user.setToken(results.getString("token"));

            return user;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // create(UserModel user)
    public void create(UserModel user) {
        database.update("INSERT INTO users (token) VALUES ('" + user.getToken() + "')");
    }

    // destroy(long id)
    public void destroy(long id) {
        database.update("DELETE FROM users WHERE user_id=" + id);
    }

}
