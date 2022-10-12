package ru.mirea.task3.task3_1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Random array with Math.random(): ");
        System.out.println(Arrays.toString(array));
        
        Arrays.sort(array);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(array));

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt() % 10;
        }

        System.out.println("Random array with class Random:");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(array));
    }
}
