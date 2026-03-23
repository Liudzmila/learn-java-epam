package com.epam.learn.main.oop;

public class Employee {
    String name;
    String location;
    double salary;
    int age;

    public Employee(int age, String location, String name, double salary) {
        this.age = age;
        this.location = location;
        this.name = name;
        this.salary = salary;
    }

    void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
