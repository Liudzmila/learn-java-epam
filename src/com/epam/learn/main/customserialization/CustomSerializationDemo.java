package com.epam.learn.main.customserialization;

import java.io.*;

public class CustomSerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Alex", 12, 22);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("data\\student.ser"));
             ObjectInputStream ois = new ObjectInputStream(
                     new FileInputStream("data\\student.ser"))) {
            oos.writeObject(student);
            student = null;
            Student.count = 0;
            Student studentReborn = (Student) ois.readObject();
            System.out.println(studentReborn);
            System.out.println(Student.count);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
