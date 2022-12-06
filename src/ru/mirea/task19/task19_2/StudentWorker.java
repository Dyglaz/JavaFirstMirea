package ru.mirea.task19.task19_2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentWorker {

    private static final GPAComparator gpaComparator = new GPAComparator();

    private static int partition(List<Student> arr, int low, int high) {
        Student pivot = arr.get(high);

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // arr.get(j).getGPA() >= pivot.getGPA()
            if (gpaComparator.compare(arr.get(j), pivot) < 0) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, high);
        return (i + 1);
    }

    private static void quickSort(List<Student> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    public static void sortStudents(List<Student> students) {
        quickSort(students, 0, students.size() - 1);
    }

    public static Student findStudentByName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student " + name + " was not found");

    }

    public static void addStudent(List<Student> students, Scanner sc) {
        String name;
        int id;
        double GPA;
        System.out.println("Введите имя, ID и GPA студента");
        sc.nextLine();
        try {
            name = sc.nextLine();
            if (name.length() == 0) {
                throw new EmptyStringException("Incorrect student name");
            }
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
            return;
        }
        id = sc.nextInt();
        GPA = Double.parseDouble(sc.next());
        students.add(new Student(name, id, GPA));
    }
}

class GPAComparator implements Comparator<Student> {

    @Override
    public  int compare(Student o1, Student o2) {
        if (o1.getGPA() < o2.getGPA()) {
            return 1;
        } else if (o1.getGPA() > o2.getGPA()) {
            return -1;
        } else {
            return  0;
        }
    }

}
