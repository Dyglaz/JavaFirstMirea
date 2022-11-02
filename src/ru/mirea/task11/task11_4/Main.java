package ru.mirea.task11.task11_4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

//Напишите пользовательский код, который формирует объекты Date и
//        Calendar по следующим данным, вводимым пользователем:
//<Год><Месяц><Число>
//<Часы1><минуты>

public class Main {
    public static void main(String[] args) {
        int year, month, day, hour, minute;

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

        Date date = new Date();
        date.setYear(year);
        date.setMonth(month);
        date.setDate(day);
        date.setHours(hour);
        date.setMinutes(minute);
        System.out.println(date);

        Calendar date1 = new GregorianCalendar();
        date1.set(Calendar.YEAR, year);
        date1.set(Calendar.MONTH, month);
        date1.set(Calendar.DAY_OF_MONTH, day);
        date1.set(Calendar.HOUR_OF_DAY, hour);
        date1.set(Calendar.MINUTE, minute);

        System.out.println();

        System.out.println("Calendar");
        System.out.println("Year: " + date1.get(Calendar.YEAR));
        System.out.println("Month: " + date1.get(Calendar.MONTH));
        System.out.println("Day: " + date1.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + date1.get(Calendar.HOUR));
        System.out.println("Minute: " + date1.get(Calendar.MINUTE));
    }
}
