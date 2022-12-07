package ru.mirea.task20.task20_4;

public class TestCalculator {
    public static void main(String[] args) {
        Integer o1 = 4;
        Long o2 = 142L;

        System.out.println("Initial numbers: " + o1 + " and " + o2);
        System.out.println("Sum: " + Calculator.sum(o1, o2));
        System.out.println("Multiplication: " + Calculator.multiply(o1, o2));
        System.out.println("Division: " + Calculator.divide(o1, o2));
        System.out.println("Subtraction: " + Calculator.subtraction(o1, o2));
    }
}
