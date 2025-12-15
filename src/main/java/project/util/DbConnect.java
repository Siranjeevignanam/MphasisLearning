package project.util;

import java.sql.Connection;
import java.sql.DriverManager;



import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

    private static final String URL = "jdbc:mysql://localhost:3306/mphasislearning";
    private static final String USER = "root";
    private static final String PASSWORD = "root@27";

    private static Connection con = null;

    private DbConnect() {
        // private constructor to prevent instantiation
    }

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
