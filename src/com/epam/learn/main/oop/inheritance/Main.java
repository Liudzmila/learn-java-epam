package com.epam.learn.main.oop.inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ModArrayList list = new ModArrayList();
        list.add(0);
        list.add(20);
        list.add(93);

        System.out.println(list.getUsingMod(1));
        System.out.println(list.getUsingMod(40));
        System.out.println(list.getUsingMod(2));
    }
}
