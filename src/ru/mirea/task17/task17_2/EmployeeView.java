package ru.mirea.task17.task17_2;

public class EmployeeView {
    public void printEmployeeInfo(String name, double salaryPerHour, int hoursWorked) {
        System.out.println("Info about worker:");
        System.out.println("Name: " + name);
        System.out.println("Salary per hour: " + salaryPerHour);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Final salary: " + (salaryPerHour * hoursWorked));
    }
}
