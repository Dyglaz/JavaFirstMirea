package ru.mirea.task30;

public class OrderAlreadyException extends Exception {
    public OrderAlreadyException(int num) {
        super("The table " + num + " is added!");
    }
}
