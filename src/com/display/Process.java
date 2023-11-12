package com.display;

import com.connection.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Process {
    public static void processToDisplayAllData() {
        try {
            Connection con = ConnectDB.createConnection();

            String query = "select * from student_data";

            Statement st = con.createStatement();

            ResultSet set = st.executeQuery(query);

            while (set.next()) {
                int studentId = set.getInt(1);
                String studentName = set.getString(2);
                String studentPhone = set.getString(3);
                String studentEmail = set.getString(4);
                String studentCity = set.getString(5);
                String studentRollNo = set.getString(6);
                String studentRegistrationNumber = set.getString(7);
                String studentBranch = set.getString(8);
                String studentYear = set.getString(9);
                String studentSemester = set.getString(10);

                System.out.println("\nStudent ID: " + studentId);
                System.out.println("Student Name: " + studentName);
                System.out.println("Student Phone: " + studentPhone);
                System.out.println("Student Email: " + studentEmail);
                System.out.println("Student City: " + studentCity);
                System.out.println("Student Roll Number: " + studentRollNo);
                System.out.println("Student Registration Number: " + studentRegistrationNumber);
                System.out.println("Student Branch: " + studentBranch);
                System.out.println("Student Year: " + studentYear);
                System.out.println("Student Semester: " + studentSemester);
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void processToDisplayDataWithSpecificId(int id) {
        try {
            Connection con = ConnectDB.createConnection();

            String query = "select * from student_data where sid=" + id + ";";

            Statement st = con.createStatement();

            ResultSet set = st.executeQuery(query);

            while (set.next()) {
                int studentId = set.getInt(1);
                String studentName = set.getString(2);
                String studentPhone = set.getString(3);
                String studentEmail = set.getString(4);
                String studentCity = set.getString(5);
                String studentRollNo = set.getString(6);
                String studentRegistrationNumber = set.getString(7);
                String studentBranch = set.getString(8);
                String studentYear = set.getString(9);
                String studentSemester = set.getString(10);

                System.out.println("\nStudent ID: " + studentId);
                System.out.println("Student Name: " + studentName);
                System.out.println("Student Phone: " + studentPhone);
                System.out.println("Student Email: " + studentEmail);
                System.out.println("Student City: " + studentCity);
                System.out.println("Student Roll Number: " + studentRollNo);
                System.out.println("Student Registration Number: " + studentRegistrationNumber);
                System.out.println("Student Branch: " + studentBranch);
                System.out.println("Student Year: " + studentYear);
                System.out.println("Student Semester: " + studentSemester);
                System.out.println();
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
