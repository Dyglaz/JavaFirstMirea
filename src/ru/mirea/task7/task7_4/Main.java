package ru.mirea.task7.task7_4;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.pow(10, 2));
        System.out.println(mc.complexNumMod(10, 10));
        System.out.println(((MathFunc)mc).getCircleLength(10));
    }
}
