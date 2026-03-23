package com.epam.learn.main.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        var dog = new Dog();
        dog.woof();

        var cat = new Cat();
        cat.meow();
    }
}
