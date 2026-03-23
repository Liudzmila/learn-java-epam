package com.epam.learn.main;

public class CodeBlock {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 5;
            a++;
        }
        //System.out.println(b); //exception

    }
}
