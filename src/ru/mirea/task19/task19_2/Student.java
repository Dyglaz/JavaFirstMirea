package ru.mirea.task19.task19_2;

public class Student implements Comparable<Student> {
    String name;
    int id;
    double GPA;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id=" + id +
                ", GPA=" + GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getGPA(), o.getGPA());
    }

    public Student(String name, int id, double GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }
}
