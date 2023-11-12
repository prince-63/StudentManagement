package com.insert;

import com.models.Models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertData {
    public static void insertData() throws IOException {
        // process to input all required data by the student
        String studentName, studentPhone, studentEmail, studentCity, studentRollNo, studentRegistrationNo, studentBranch, studentYear, studentSemester;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter Student Name: ");
        studentName = br.readLine();
        System.out.print("\nEnter Student Phone: ");
        studentPhone = br.readLine();
        System.out.print("\nEnter Student Email: ");
        studentEmail = br.readLine();
        System.out.print("\nEnter Student City: ");
        studentCity = br.readLine();
        System.out.print("\nEnter Student RollNo: ");
        studentRollNo = br.readLine();
        System.out.print("\nEnter Student RegistrationNo: ");
        studentRegistrationNo = br.readLine();
        System.out.print("\nEnter Student Branch: ");
        studentBranch = br.readLine();
        System.out.print("\nEnter Student Year: ");
        studentYear = br.readLine();
        System.out.print("\nEnter Student Semester: ");
        studentSemester = br.readLine();

        Models student = new Models(studentName, studentPhone, studentEmail, studentCity, studentRollNo, studentRegistrationNo, studentBranch, studentYear, studentSemester);

        // process to sending student data to database
        boolean check = Process.processing(student);

        if(check) {
            System.out.println("\nSuccessfully inserted data.");
        }
        else {
            System.out.println("\nSomething went wrong in insertion process.");
        }
    }
}
