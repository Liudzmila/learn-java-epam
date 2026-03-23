package com.epam.learn.main.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Writing a serialized object into a file with SerializationDemo.java
 * Console Output:
 * Student[name='John', group=12, password='qwerty']
 */
public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("data\\student.dat"))) {
            Student student = new Student("John", 12, "qwerty");
            System.out.println(student);
            output.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
