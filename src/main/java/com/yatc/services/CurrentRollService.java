package com.yatc.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yatc.utils.Database;
import com.yatc.models.CurrentRollModel;

public class CurrentRollService {

    // FIELDS
    // database
    private Database database = new Database();

    // PUBLIC METHODS
    // findOne(long id)
    public CurrentRollModel findOne(long id) {
        try {
            ResultSet results = database.query("SELECT current_roll_id, roll_count, die_1_id, die_2_id, die_3_id, die_4_id, die_5_id FROM current_rolls WHERE current_roll_id=" + id);
            CurrentRollModel currentRoll = new CurrentRollModel();

            results.next();

            currentRoll.setId(results.getLong("current_roll_id"));
            currentRoll.setRollCount(results.getInt("roll_count"));
            currentRoll.setDie1Id(results.getLong("die_1_id"));
            currentRoll.setDie2Id(results.getLong("die_2_id"));
            currentRoll.setDie3Id(results.getLong("die_3_id"));
            currentRoll.setDie4Id(results.getLong("die_4_id"));
            currentRoll.setDie5Id(results.getLong("die_5_id"));

            return currentRoll;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }

    // update(CurrentRollModel currentRoll)
    public void update(CurrentRollModel currentRoll) {
        database.update("UPDATE current_rolls SET roll_count=" + currentRoll.getRollCount() + " WHERE current_roll_id=" + currentRoll.getId());
    }

    // destroy(long id)
    public void destroy(long id) {
        database.update("DELETE FROM current_rolls WHERE current_roll_id=" + id);
    }

}
