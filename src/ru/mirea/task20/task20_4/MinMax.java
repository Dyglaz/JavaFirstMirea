package ru.mirea.task20.task20_4;

public class MinMax<T extends Comparable<T>> {
    T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        if (array.length == 0)
            return null;
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) < 0) {
                result = array[i];
            }
        }
        return result;
    }

    public T findMax() {
        if (array.length == 0)
            return null;
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) > 0) {
                result = array[i];
            }
        }
        return result;
    }
}