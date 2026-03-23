package com.epam.learn.main.customserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.util.StringJoiner;

class Student extends Person {
    private int group;

    public Student(String name, int group, int age) {
        this.name = name;
        this.group = group;
        this.age = age;
        System.out.println("Student constructor");
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("Custom Serialization!");
        out.writeInt(group);
        out.writeInt(age);
        out.writeUTF(name);
        out.writeInt(count);
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException {
        System.out.println("Custom Deserialization!");
        group = in.readInt();
        age = in.readInt();
        name = in.readUTF();
        count = in.readInt();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("group=" + group)
                .add("age=" + age)
                .toString();
    }
}

