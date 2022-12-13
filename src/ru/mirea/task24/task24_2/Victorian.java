package ru.mirea.task24.task24_2;

public class Victorian implements Chair {
    private String color;
    private int size;
    Victorian(String c, int s) {
        color = c;
        size = s;
    }
    public void specialCharacteristic() {
        System.out.println("I am Victorian chair!");
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
        return "Victorian chair: color=" + color + ", size=" + size;
    }
}
