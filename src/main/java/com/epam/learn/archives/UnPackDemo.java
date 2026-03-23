package main.java.com.epam.learn.archives;

/**
 * Archiving a process launch with UnPackDemo.java
 */

public class UnPackDemo {
    public static void main(String[] args) {
        String nameJar = "example.jar";
        String destinationPath = "c:\\tmp\\";
        new UnPackJar().unpack(destinationPath, nameJar);
    }
}
