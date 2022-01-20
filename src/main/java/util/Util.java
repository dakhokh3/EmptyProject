package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String dbUrl = "jdbc:mysql://localhost:3306/mydbtest";
    private static String dbUsername = "root";
    private static String dbPassword = "YRV_06111997";


    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return connection;
    }
}
