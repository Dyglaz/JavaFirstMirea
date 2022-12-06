package ru.mirea.task17.task17_2;

import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = getEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setHoursWorked(12);
        System.out.println("\nUpdated info about worker: ");
        controller.updateView();
    }

    private static Employee getEmployeeFromDatabase() {
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        employee.setName(sc.next());
        employee.setSalaryPerHour(sc.nextDouble());
        employee.setHoursWorked(sc.nextInt());
        return employee;
    }
}
