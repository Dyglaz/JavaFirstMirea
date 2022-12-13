package ru.mirea.task29.task29PackFirst;

public class OrderAlreadyException extends Exception {
    public OrderAlreadyException(int num) {
        super("The table " + num + " is added!");
    }
}
