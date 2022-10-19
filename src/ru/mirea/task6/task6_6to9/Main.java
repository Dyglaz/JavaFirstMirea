package ru.mirea.task6.task6_6to9;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[10];
        printables[0] = new Book();
        printables[1] = new Book();
        printables[2] = new Shop();
        printables[3] = new Book();
        printables[4] = new Shop();
        printables[5] = new Book();
        printables[6] = new Book();
        printables[7] = new Shop();
        printables[8] = new Book();
        printables[9] = new Shop();

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
