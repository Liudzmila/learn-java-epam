package com.epam.learn.main.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Contact jack = new Contact("Jack", "jack@gmail.com");
        Contact jim = new Contact("Jim", new PhoneNumber("5647891472"));
        Contact ella = new Contact("Ella", new PhoneNumber(48, "555666777"), "ella@gmail.com");

        System.out.println(jack);
        System.out.println(jim);
        System.out.println(ella);
    }
}
