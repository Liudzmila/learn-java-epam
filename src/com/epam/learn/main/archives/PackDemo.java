package com.epam.learn.main.archives;

import java.io.FileNotFoundException;

/**
 * Archiving a process launch with PackDemo.java
 * As a result, the archive file example.jar is created in the project's root.
 */
public class PackDemo {
    public static void main(String[] args) {
        String dirName = "data";
        try {
            PackJar packJar = new PackJar("example.jar");
            packJar.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
