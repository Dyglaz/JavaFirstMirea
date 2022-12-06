package ru.mirea.task18.task18_7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        printDetails(key);
    }

    public void printDetails(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (Exception e) {
            message = e.getMessage();
        }
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
