package ru.mirea.task18.task18_4;

import java.util.Scanner;

// Шаг 2
// Блок finally отрабатывает как при выбросе исключения, так
// и при корректном вводе

public class Exception4 {
    public void exceptionDemoTry() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Wrong format");
        } finally {
            System.out.println("Finally message");
        }
    }

    public static void main(String[] args) {
        Exception4 exception = new Exception4();
        exception.exceptionDemoTry();
    }
}
