package ru.mirea.task10.task10_1ANDtask10_3;

//Напишите программу, которая объединяет два списка данных о
//        студентах в один отсортированный списках.

//Сортировка по курсу

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparator<Student> {
    void merge(List<Student> arr, int l, int r, int m) {
        List<Student> arr1 = new ArrayList<>(arr.subList(l, m + 1));
        List<Student> arr2 = new ArrayList<>(arr.subList(m + 1, r + 1));
        int k = l;
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i).compareTo(arr2.get(j)) <= 0) {
                arr.set(k, arr1.get(i));
                i++;
            }
            else {
                arr.set(k, arr2.get(j));
                j++;
            }
            k++;
        }
        while (i < arr1.size()) {
            arr.set(k, arr1.get(i));
            i++;
            k++;
        }

        while (j < arr2.size()) {
            arr.set(k, arr2.get(j));
            j++;
            k++;
        }
    }

    void mergeSort(List<Student> arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, r, mid);

        }
    }

    List<Student> mergeIntoSorted (List<Student> list1, List<Student> list2) {
        List<Student> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        mergeSort(result, 0, result.size() - 1);
        return result;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
