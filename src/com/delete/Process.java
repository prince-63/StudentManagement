package com.delete;

import com.connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Process {
    public static boolean processToDeleteAllData() {
        boolean isTrue = false;
        try {
            Connection con = ConnectDB.createConnection();

            String query = "delete from student_data;";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.executeUpdate();

            isTrue = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return isTrue;
    }

    public static boolean processToDeleteSpecificDataWithId(String id) {
        boolean isTrue = false;
        try {
            Connection con = ConnectDB.createConnection();

            String query = "delete from student_data where sid=?;";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1, id);

            preparedStatement.executeUpdate();

            isTrue = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return isTrue;
    }
}
