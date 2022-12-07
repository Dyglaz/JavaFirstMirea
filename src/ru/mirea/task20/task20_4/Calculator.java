package ru.mirea.task20.task20_4;

public class Calculator {

    public static <T extends Number> double sum(T o1, T o2) {
        return o1.doubleValue() + o2.doubleValue();
    }

    public static <T extends Number> double multiply(T o1, T o2) {
        return o1.doubleValue() * o2.doubleValue();
    }

    public static <T extends Number> double divide(T o1, T o2) {
        return o1.doubleValue() / o2.doubleValue();
    }

    public static <T extends Number> double subtraction(T o1, T o2) {
        return o1.doubleValue() - o2.doubleValue();
    }
}
