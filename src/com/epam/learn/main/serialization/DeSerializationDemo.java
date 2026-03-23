package com.epam.learn.main.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Reading a serialized object from a file with DeSerializationDemo.java
 * Console Output:
 * Student[name='John', group=12, password='null']
 */
public class DeSerializationDemo {
    public static void main(String[] args) {
        Student.faculty ="CS";
        try(ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("data\\student.dat"))) {
            Student student = (Student) input.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}