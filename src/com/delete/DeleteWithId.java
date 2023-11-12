package com.delete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteWithId {
    public static void deleteWithId() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter Student id to delete : ");
        String id = br.readLine();

        // deleting process
        boolean check = Process.processToDeleteSpecificDataWithId(id);

        if(check) {
            System.out.println("\n successfully deleted.\n");
        }
        else {
            System.out.println("\n something went wrong in deletion.\n");
        }
    }
}
