package com.update;

import com.operations.Operations;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EditingData {
    public static void editingData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter student id to update data : ");
        String id = br.readLine();
        System.out.println();

        System.out.println("Which thing you are looking to update.\n");
        System.out.println("1. name");
        System.out.println("2. phone");
        System.out.println("3. email");
        System.out.println("4. city");
        System.out.println("5. roll no");
        System.out.println("6. registration number");
        System.out.println("7. branch");
        System.out.println("8. year");
        System.out.println("9. semester");
        System.out.println("10. exit");

        // Get user input
        System.out.print("Enter your choice : ");
        int choice = Integer.parseInt(br.readLine());
        System.out.println();

        // Perform actions based on user choice
        while(true) {
            if (choice == 1) {
                System.out.print("Enter name : ");
                String name = br.readLine();
                String column = "sname";
                boolean check = Process.updateStudentData(id, column, name);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student name.\n");
                }
            } else if (choice == 2) {
                System.out.print("Enter phone number : ");
                String phone = br.readLine();
                String column = "sphone";
                boolean check = Process.updateStudentData(id, column, phone);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student phone number.\n");
                }
            } else if (choice == 3) {
                System.out.print("Enter email : ");
                String email = br.readLine();
                String column = "semail";
                boolean check = Process.updateStudentData(id, column, email);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student email.\n");
                }
            } else if (choice == 4) {
                System.out.print("Enter city : ");
                String city = br.readLine();
                String column = "scity";
                boolean check = Process.updateStudentData(id, column, city);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student city.\n");
                }
            } else if (choice == 5) {
                System.out.print("Enter roll number : ");
                String rollNo = br.readLine();
                String column = "srollno";
                boolean check = Process.updateStudentData(id, column, rollNo);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student roll number.\n");
                }
            } else if (choice == 6) {
                System.out.print("Enter registration number : ");
                String regNo = br.readLine();
                String column = "sregistration_no";
                boolean check = Process.updateStudentData(id, column, regNo);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student registration number.\n");
                }
            } else if (choice == 7) {
                System.out.print("Enter branch : ");
                String branch = br.readLine();
                String column = "sbranch";
                boolean check = Process.updateStudentData(id, column, branch);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student branch.\n");
                }
            } else if (choice == 8) {
                System.out.print("Enter year : ");
                String year = br.readLine();
                String column = "syear";
                boolean check = Process.updateStudentData(id, column, year);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student year.\n");
                }
            } else if (choice == 9) {
                System.out.print("Enter semester : ");
                String semester = br.readLine();
                String column = "s_semester";
                boolean check = Process.updateStudentData(id, column, semester);
                if (check) {
                    System.out.println("Successfully Updated.\n");
                    editingData();
                } else {
                    System.out.println("Something went wrong for updating student semester.\n");
                }
            } else if (choice == 10) {
                Operations.operations();
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
            }
        }
    }
}
