package ru.mirea.task9.task9_2and9_4;

//Напишите свою собственную реализацию интерфейса Comparable

public class Student implements Comparable<Student>{
    String name;
    int id;
    double GPA;

    public Student(String name, int id, double GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student st) {
        return Double.compare(this.getGPA(), st.getGPA());
    }
}
