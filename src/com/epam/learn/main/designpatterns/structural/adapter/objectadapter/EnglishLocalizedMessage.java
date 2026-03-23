package com.epam.learn.main.designpatterns.structural.adapter.objectadapter;

public class EnglishLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
