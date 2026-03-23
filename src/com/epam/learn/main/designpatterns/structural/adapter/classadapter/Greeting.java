package com.epam.learn.main.designpatterns.structural.adapter.classadapter;

public class Greeting {

    private final LocalizedMessage localizedMessage;

    public Greeting(LocalizedMessage localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public void print() {
        localizedMessage.sayHello();
    }
}
