package ru.mirea.task4.task4_1_8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        double s;
        s = width * length;
        return s;
    }

    @Override
    double getPerimeter() {
        double p;
        p = 2 * (width + length);
        return p;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "color = " + color +", filled = " + filled +", width = " + width +", length = " + length;
    }
}
