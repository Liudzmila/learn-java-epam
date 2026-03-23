package main.java.com.epam.learn;

import java.io.IOException;

public class InputProgram {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            System.out.println("code " + x + " x=" + (char)x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
