package es.nebrija.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Properties;

public class DbConnection{
    public static Connection instance = null;
    public static final String URL = "jdbc:mysql://localhost:3306/etpa2";

    public static Connection getConnection() throws SQLException {
        if (instance == null) {
            Properties props = new Properties();
            props.put("user", "root");
            props.put("password", "root");

            instance = DriverManager.getConnection(URL, props);
        }
        return instance;
    }
}