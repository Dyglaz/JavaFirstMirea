package ru.mirea.task3.task3_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + (int) (Math.random() * 90);
        }

        System.out.println(Arrays.toString(array));

        boolean flag  = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                flag = false;
                break;
            }
        }
        System.out.println("The sequence is " + (flag ? "" : "not ") + "strictly increasing");
    }
}
