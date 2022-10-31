package ru.mirea.task7.task7_4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double num, double power) {
        return Math.pow(num, power);
    }

    @Override
    public double complexNumMod(double first, double two) {
        return Math.sqrt(Math.pow(first, 2) + Math.pow(two, 2));
    }

    public double getCircleLength(double radius) {
        return 2 * PI * radius;
    }
}
