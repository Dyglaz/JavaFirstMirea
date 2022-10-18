package ru.mirea.task4.task4_1_8;

public class Square extends Rectangle {
    protected double side;

    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square: " + "color = " + color +", filled = " + filled +", side = " + side +", width = " + width +", length = " + length;
    }
}
