package com.yatc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

    // PRIVATE CONSTANTS
    // String address
    private final String ADDRESS = "jdbc:mysql://localhost/";
    // String username
    private final String USERNAME = "root";
    // String password
    private final String PASSWORD = "akj04210";
    // String DB_NAME
    private final String DB_NAME = "yatc";

    // PRIVATE FIELDS
    // connection
    private Connection connection = null;

    // CONSTRUCTORS
    // default
    public Database() {
        connect();
    }

    // PUBLIC METHODS
    // void connect()
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(ADDRESS + DB_NAME, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // ResultSet query(String sql)
    public ResultSet query(String sql) {
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // void update(String sql)

}
