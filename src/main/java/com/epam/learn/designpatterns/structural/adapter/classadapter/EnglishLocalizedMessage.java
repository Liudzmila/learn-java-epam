package main.java.com.epam.learn.designpatterns.structural.adapter.classadapter;

public class EnglishLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
