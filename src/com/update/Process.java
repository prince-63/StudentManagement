package com.update;

import com.connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Process {
    public static boolean updateStudentData(String id, String updateColName, String updateData) {
        boolean isTrue = false;

        try {
            Connection con = ConnectDB.createConnection();

            String query = "update student_data " +
                    "set " + updateColName +"='" + updateData +
                    "' WHERE sid='" + id + "';";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.executeUpdate();

            isTrue = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return isTrue;
    }
}
