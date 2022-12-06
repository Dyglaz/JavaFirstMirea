package ru.mirea.task18.task18_3;

import java.util.Scanner;

// Шаг 1 и 2
// Используя общее исключение мы можем узнать о нем информацию
// с помощью метода toString().
// Если данные корректны, программа отрабатывает корректно.

public class Exception3 {
    public void exceptionDemoTry() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Exception3 exception = new Exception3();
        exception.exceptionDemoTry();
    }
}
