package main.java.com.epam.learn.designpatterns.structural.adapter.objectadapter;

public class EnglishLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
