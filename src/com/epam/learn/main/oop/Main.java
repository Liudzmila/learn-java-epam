package com.epam.learn.main.oop;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(32, "India", "Janardhan", 78000);

        Employee newEmployee = new Employee(31, "Poland", "Jacek", 140000);
        newEmployee.raiseSalary();

        System.out.println("Employee salary is " + employee.salary);
        System.out.println("New employee salary is " + newEmployee.salary);
    }
}
