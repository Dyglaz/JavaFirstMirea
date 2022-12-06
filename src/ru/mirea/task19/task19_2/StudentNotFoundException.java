package ru.mirea.task19.task19_2;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
