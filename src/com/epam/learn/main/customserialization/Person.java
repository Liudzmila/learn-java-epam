package com.epam.learn.main.customserialization;

import java.io.Serializable;

class Person implements Serializable {
    public static int count = 0;
    protected String name;
    protected transient int age;

    public Person() {
        System.out.println("Person default constructor");
        count++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
        count++;
    }
    //...
}
