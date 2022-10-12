package ru.mirea.task3.task3_4;

//Пользователь должен ввести с клавиатуры размер массива -
//натуральное число больше, так чтобы введенное пользователем число
//сохранялось в переменную n. Если пользователь ввел не подходящее число, то
//программа должна просить пользователя повторить ввод. Создать массив из n
//случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
//массив только из четных элементов первого массива, если они там есть, и
//вывести его на экран.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива, число больше 0: ");
        size = sc.nextInt();
        while (size <= 0) {
            System.out.println("Повторите ввод");
            size = sc.nextInt();
        }

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (size + 1));
        }

        System.out.print("Array elements: ");
        System.out.println(Arrays.toString(array));

        boolean hasEven = false;
        for (int val : array) {
            hasEven = (val % 2 == 0);
            if (hasEven) break;
        }

        if (!hasEven) {
            System.out.println("There are no even elements");
            System.exit(0);
        }

        int[] arrayTwo = new int[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                arrayTwo[j] = array[i];
                j++;
            }
        }

        System.out.print("Even array elements: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arrayTwo[i] + " ");
        }
    }
}
