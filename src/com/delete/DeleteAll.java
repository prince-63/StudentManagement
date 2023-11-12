package com.delete;

public class DeleteAll {
    public static void deleteAll() {
        boolean check = Process.processToDeleteAllData();

        if(check) {
            System.out.println("\n successfully deleted.\n");
        }
        else {
            System.out.println("\n something went wrong in deletion.\n");
        }
    }
}
