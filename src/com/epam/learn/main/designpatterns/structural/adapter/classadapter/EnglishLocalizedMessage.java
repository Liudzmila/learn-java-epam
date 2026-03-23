package com.epam.learn.main.designpatterns.structural.adapter.classadapter;

public class EnglishLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
