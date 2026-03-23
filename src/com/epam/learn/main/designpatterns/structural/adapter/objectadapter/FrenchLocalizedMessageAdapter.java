package com.epam.learn.main.designpatterns.structural.adapter.objectadapter;

public class FrenchLocalizedMessageAdapter implements LocalizedMessage {

    private final FrenchLocalizedMessage frenchLocalizedMessage;

    public FrenchLocalizedMessageAdapter() {
        this.frenchLocalizedMessage = new FrenchLocalizedMessage();
    }


    @Override
    public void sayHello() {
        frenchLocalizedMessage.sayBonjour();
    }
}
