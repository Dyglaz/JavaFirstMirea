package ru.mirea.task31.task31_2_1;

public class MyExecption extends Exception {
    public MyExecption() {
        super("The first argument is negative");
    }
}