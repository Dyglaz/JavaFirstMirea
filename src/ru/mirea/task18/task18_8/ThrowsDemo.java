package ru.mirea.task18.task18_8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        while (true) {
            try {
                Scanner myScanner = new Scanner(System.in);
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message;
        message = getDetails(key);
        System.out.println( message );

    }

    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
