package ru.mirea.task25.task25_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
private static String str;
private static boolean bool;
private static final String regularIP =
        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    str = scan.next();
    bool = validate(str);

    if(bool) {
        System.out.println("The string is an IP address");
    }
    else {
        System.out.println("The string is not an IP address");
    }
}
public static boolean validate(String ip){
    Pattern pattern = Pattern.compile(regularIP);
    Matcher matcher = pattern.matcher(ip);
    return matcher.matches();
}
}
