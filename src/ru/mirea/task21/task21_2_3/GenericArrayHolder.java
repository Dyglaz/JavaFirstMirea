package ru.mirea.task21.task21_2_3;

import java.util.Arrays;

public class GenericArrayHolder <T> {
    private T[] array;
    int size;

    public GenericArrayHolder(T[] array) {
        this.array = array;
        size = 0;
    }

    public void addElement(T el) {
        if (size < array.length) {
            array[size++] = el;
        }
        else {
            System.out.println("Array is full");
        }
    }

    public T getElement(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public T[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "GenericArrayHolder{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
