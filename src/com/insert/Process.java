package com.insert;

import com.connection.ConnectDB;
import com.models.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Process {

    public static boolean processing(Models student) {
        boolean isTrue = false;

        try {
            Connection con = ConnectDB.createConnection();

            String query = "insert into student_data(sname, sphone, semail, scity, srollno, sregistration_no, sbranch, syear, s_semester) value(?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            // insert process
            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getStudentPhone());
            preparedStatement.setString(3, student.getStudentEmail());
            preparedStatement.setString(4, student.getStudentCity());
            preparedStatement.setString(5, student.getStudentRollNo());
            preparedStatement.setString(6, student.getStudentRegistrationNumber());
            preparedStatement.setString(7, student.getStudentBranch());
            preparedStatement.setString(8, student.getStudentYear());
            preparedStatement.setString(9, student.getStudentSemester());

            preparedStatement.executeUpdate();
            isTrue = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return isTrue;
    }
}
