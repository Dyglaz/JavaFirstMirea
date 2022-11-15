package ru.mirea.task13.Primer;

public class StringBuilderTest {
    public static void main(String[] args) {
        // Создадим строку типа YYYY-MM-DD HH:MM:SS
        int year = 2010, month = 10, day = 10;
        int hour = 10, minute = 10, second = 10;
        String dateStr = new StringBuilder().append(year).append("").append(month).append("").append(day).append("").append(hour).append(":").append(minute).append(":").append(second).toString();
        System.out.println(dateStr);
        // StringBuilder более эффективная конкатенация строк
        String anotherDataStr = year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;
        System.out.println(anotherDataStr);
    }
}
