package ru.mirea.task25.task25_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task {
    private static String str;
    private static boolean bool;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        str = scan.next();
        bool = checkExpression(str);

        if(bool) {
            System.out.println("The string is an IP address");
        }
        else {
            System.out.println("The string is not an IP address");
        }
    }

    private static boolean checkExpression(String input) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        return input.matches("[\\d+/*-]*");
    }
}
