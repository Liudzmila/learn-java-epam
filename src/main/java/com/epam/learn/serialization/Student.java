package main.java.com.epam.learn.serialization;

import java.io.Serializable;
import java.util.StringJoiner;

/**
The serialized class Student.java
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    static String faculty = "IT";
    private String name;
    private int group;
    private transient String password;

    public Student(String name, int group, String password) {
        this.name = name;
        this.group = group;
        this.password = password;
    }

    // ...

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("group=" + group)
                .add("password='" + password + "'")
                .toString();
    }
}

/**
 * Finally, here is the result of all three fragments of code:
 *
 * The fields name and group of the new object student maintained the values given
 * to them before they were written into the file.
 * The field password got the default value 'null' due to the specifier transient.
 * The field faculty marked as static got its current value. So,
 * during the creation of the object student, the field received the value 'IT' at initialization,
 * and then its value was changed to 'CS'.
 */