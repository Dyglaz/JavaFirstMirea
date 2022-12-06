package ru.mirea.task19.task19_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kirill", 1, 3.5));
        students.add(new Student("Slava", 2, 4.0));
        students.add(new Student("Viktor", 3, 3.0));

        Scanner sc = new Scanner(System.in);
        int cmd;
        System.out.println("0) Выход");
        System.out.println("1) Добавить студента");
        System.out.println("2) Найти студента по имени");
        System.out.println("3) Отсортировать студентов по успеваемости");
        System.out.println("4) Список студентов");
        while (true) {
            while (true) {
                cmd = sc.nextInt();
                if (cmd >= 0 && cmd <= 4) {
                    break;
                }
            }
            switch (cmd) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    StudentWorker.addStudent(students, sc);
                    break;
                case 2:
                    Student foundStudent;
                    String name = "";
                    System.out.println("Введите имя студента для поиска: ");
                    sc.nextLine();
                    try {
                        name = sc.nextLine();
                        foundStudent = StudentWorker.findStudentByName(students, name);
                    } catch (StudentNotFoundException e) {
                        if (name.isEmpty()) {
                            throw new EmptyStringException("Student name is incorrect", e);
                        }
                        System.out.println(e.getMessage());
                        continue;
                    }
                    System.out.println("Информация о студенте");
                    System.out.println(foundStudent);
                    break;
                case 3:
                    StudentWorker.sortStudents(students);
                    break;
                case 4:
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
            }
        }

    }
}
