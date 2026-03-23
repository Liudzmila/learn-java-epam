package main.java.com.epam.learn.designpatterns.structural.adapter.classadapter;

public class FrenchLocalizedMessageAdapter extends FrenchLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        sayBonjour();
    }
}
