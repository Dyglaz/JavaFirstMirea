package ru.mirea.task4.task4_1_8;

public class Circle extends Shape {
    protected double radius;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        double s;
        s = Math.PI * radius * radius;
        return s;
    }

    @Override
    double getPerimeter() {
        double p;
        p = 2 * Math.PI * radius;
        return p;
    }

    @Override
    public String toString() {
        return "Circle: " + "color = " + color +", filled = " + filled +", radius = " + radius;
    }
}
