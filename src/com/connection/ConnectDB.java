package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    static Connection con;

    public static Connection createConnection() {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating connection
            String userName = "root";
            String password = "prince";
            String url = "jdbc:mysql://localhost:3306/STUDENT";

            con = DriverManager.getConnection(url, userName, password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        // returning connection result
        return con;
    }
}
