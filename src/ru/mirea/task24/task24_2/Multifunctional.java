package ru.mirea.task24.task24_2;

public class Multifunctional implements Chair {
    private String color;
    private int size;
    Multifunctional(String c, int s) {
        color = c;
        size = s;
    }
    public void specialCharacteristic() {
        System.out.println("I am Multifunctional chair!");
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Multifunctional chair: color=" + color + ", size=" + size;
    }
}
