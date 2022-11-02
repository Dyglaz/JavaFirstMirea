package ru.mirea.task11.Primer;

import java.util.Calendar;

public class Data2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
// You cannot use Date class to extract individual Date fields
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); // 0 to 11
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
// Заполняем нулями
        System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n", year, month+1, day, hour, minute, second);
    }
}