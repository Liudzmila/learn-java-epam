package main.java.com.epam.learn.oop.polymorphism;

import java.util.StringJoiner;

public class Contact {
    String name;
    PhoneNumber phoneNumber;
    String email;

    public Contact(String name, PhoneNumber phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contact(String name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Contact.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("phoneNumber='" + phoneNumber + "'")
                .add("email='" + email + "'")
                .toString();
    }
}
