package ru.mirea.task6.task6_10;

public enum Brands {
    LENOVO,
    HP,
    DELL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
