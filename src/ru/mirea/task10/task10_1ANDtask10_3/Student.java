package ru.mirea.task10.task10_1ANDtask10_3;

//Создать свой класс Student со всеми переменными экземпляра,
//        конструктором, включающим все переменные, предпочтительно
//        использовать геттеры и сеттеры для каждой переменной. Класс студент
//        использовать геттеры и сеттеры для каждой переменной. Класс студент имеет свойства: Имя, Фамилия, Специальность, Курс, Группа

public class Student implements Comparable<Student> {
    String name;
    String surname;
    String spec;
    int course;
    int group;

    public Student(String name, String surname, String spec, int course, int group) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", spec='" + spec + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getCourse() - o.getCourse();
    }
}
