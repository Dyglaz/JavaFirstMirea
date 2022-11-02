package ru.mirea.task11.task11_2;

//Приложение, сравнивающее текущую дату и дату, введенную
//        пользователем c текущим системным временем

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Date userDate = new Date();
        Date sysTime = new Date(System.currentTimeMillis());

        int year, month, day, hour, minute, second;
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        year = sc.nextInt();
        System.out.print("Month: ");
        month = sc.nextInt();
        System.out.print("Day: " );
        day = sc.nextInt();
        System.out.print("Hour: ");
        hour = sc.nextInt();
        System.out.print("Minute: ");
        minute = sc.nextInt();
        System.out.print("Second: ");
        second = sc.nextInt();

        userDate.setYear(year);
        userDate.setMonth(month);
        userDate.setDate(day);
        userDate.setHours(hour);
        userDate.setMinutes(minute);
        userDate.setSeconds(second);

        if (date.compareTo(sysTime) > 0) {
            System.out.println("Today is after System Time");
        } else if (date.compareTo(sysTime) < 0) {
            System.out.println("Today is before System Time");
        } else {
            System.out.println("Today is equal to System Time");
        }

        if (userDate.compareTo(sysTime) > 0) {
            System.out.println("User's date is after System Time");
        } else if (date.compareTo(sysTime) < 0) {
            System.out.println("User's date is before System Time");
        } else {
            System.out.println("User's date is equal to System Time");
        }
    }
}
