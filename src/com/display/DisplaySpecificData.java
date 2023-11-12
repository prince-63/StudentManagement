package com.display;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplaySpecificData {
    public static void displaySpecificData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter id to display data : ");
        int id = Integer.parseInt(br.readLine());

        Process.processToDisplayDataWithSpecificId(id);
    }
}
