package ru.mirea.task9.task9_2and9_4;

//Напишите класс SortingStudentsByGPA который реализует
//        интерфейс Comparator таким образом, чтобы сортировать список студентов
//        по их итоговым баллам в порядке убывания с использованием алгоритма
//        быстрой сортировки.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        students.add(new Student("Andrei", 1, 2.2));
        students.add(new Student("Kostya", 2, 3.3));
        students.add(new Student("Maxim", 3, 3.1));
        students.add(new Student("Anton", 4, 2.0));
        students.add(new Student("Petya", 5, 4.5));
        students.add(new Student("Vlad", 6, 2.1));

        System.out.println(students.toString());
        sorter.sortStudents(students);
        System.out.println(students.toString());
    }
}
