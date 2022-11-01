package ru.mirea.task10.task10_1ANDtask10_3;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Student> arr1 = new ArrayList<>();
        arr1.add(new Student("Кирилл", "Нефёдов", "Программная инженерия", 4, 1));
        arr1.add(new Student("Андрей", "Калина", "Биология", 1, 3));
        arr1.add(new Student("Тимофей", "Разумовский", "Инженерное дело", 2, 11));

        List<Student> arr2 = new ArrayList<>();
        arr2.add(new Student("Иван", "Поляков", "Информатика и вычислительная техника", 2, 4));
        arr2.add(new Student("Карина", "Калинобродская", "Сестринское дело", 5, 10));
        arr2.add(new Student("Марк", "Цукенберг", "Программная инженерия", 3, 1));

        System.out.println(arr1.toString());
        System.out.println("------------");
        System.out.println(arr2.toString());
        System.out.println("------------");
        System.out.println("Result: ");

        Main sort = new Main();
        List<Student> res = sort.mergeIntoSorted(arr1, arr2);
        System.out.println(res.toString());
    }
}
