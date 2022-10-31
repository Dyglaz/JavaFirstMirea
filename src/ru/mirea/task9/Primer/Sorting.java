package ru.mirea.task9.Primer;

public class Sorting {
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                    temp = list[min];
                    list[min] = list[index];
                    list[index] = temp;
                }
        }
    }
}
