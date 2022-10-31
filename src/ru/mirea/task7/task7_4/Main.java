package ru.mirea.task7.task7_4;

//Разработайте интерфейс MathCalculable, который содержит
//        объявления математических функций: возведения в степень и модуль
//        комплексного числа, также содержит число PI. Напишите класс MathFunc,
//        который реализует, реализует этот интерфейс. Например, вычисления
//        длины окружности, для чего используйте число PI из интерфейса.

public class Main {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.pow(10, 2));
        System.out.println(mc.complexNumMod(10, 10));
        System.out.println(((MathFunc)mc).getCircleLength(10));
    }
}
