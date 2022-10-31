package ru.mirea.task9.task9_2and9_4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    int SupQuickSort(List<Student> arr, int low, int high) {
        Student pivot = arr.get(high);

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (this.compare(arr.get(j), pivot) < 0) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, high);
        return (i + 1);
    }

    void quickSort(List<Student> arr, int low, int high) {
        if (low < high) {
            int pi = SupQuickSort(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() < o2.getGPA()) {
            return 1;
        } else if (o1.getGPA() > o2.getGPA()) {
            return -1;
        } else {
            return  0;
        }
    }

    public void sortStudents(List<Student> students) {
        quickSort(students, 0, students.size() - 1);
    }
}
