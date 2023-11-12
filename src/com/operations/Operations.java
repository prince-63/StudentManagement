package com.operations;

import com.delete.DeleteAll;
import com.delete.DeleteWithId;
import com.display.DisplayAllData;
import com.display.DisplaySpecificData;
import com.insert.InsertData;
import com.update.Update;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
    public static void operations() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Enter 1 to insert student data.");
            System.out.println("Enter 2 to display all student data.");
            System.out.println("Enter 3 to display specific student data.");
            System.out.println("Enter 4 to delete all student data.");
            System.out.println("Enter 5 to delete specific student data.");
            System.out.println("Enter 6 to update student data.");
            System.out.println("Enter 7 to exit.");
            System.out.print("Enter your choice : ");
            int ch = Integer.parseInt(br.readLine());

            if (1 == ch) {
                // insert data
                InsertData.insertData();
            } else if (2 == ch) {
                // display all
                DisplayAllData.displayAllData();
            } else if (3 == ch) {
                // display with student id
                DisplaySpecificData.displaySpecificData();
            } else if (4 == ch) {
                // delete all data
                DeleteAll.deleteAll();
            } else if (5 == ch) {
                // delete specific data
                DeleteWithId.deleteWithId();
            } else if (6 == ch) {
                // update data
                Update.update();
            } else if (7 == ch) {
                // exit
                break;
            } else {
                System.out.println("Please enter the right choice.");
            }
        }
    }
}