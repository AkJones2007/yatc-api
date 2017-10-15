package com.yatc.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yatc.utils.Database;
import com.yatc.models.DieModel;

public class DieService {

    // FIELDS
    // database
    private Database database = new Database();

    // PUBLIC METHODS
    // findOne(long id)
    public DieModel findOne(long id) {
        try {
            ResultSet results = database.query("SELECT die_id, value, is_held FROM dice WHERE die_id=" + id);
            DieModel die = new DieModel();

            results.next();

            die.setId(results.getLong("die_id"));
            die.setValue(results.getInt("value"));
            die.setIsHeld(results.getBoolean("is_held"));

            return die;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // update(DieModel die)
    public void update(DieModel die) {
        database.update("UPDATE dice SET value=" + die.getValue() + ", is_held=" + die.getIsHeld() + " WHERE die_id=" + die.getId());
    }

    // destroy(long id)
    public void destroy(long id) {
        database.update("DELETE FROM dice WHERE die_id=" + id);
    }

}
