package com.epam.learn.main.designpatterns.structural.adapter.classadapter;

public class FrenchLocalizedMessageAdapter extends FrenchLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        sayBonjour();
    }
}
