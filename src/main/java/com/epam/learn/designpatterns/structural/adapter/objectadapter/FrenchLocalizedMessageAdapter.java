package main.java.com.epam.learn.designpatterns.structural.adapter.objectadapter;

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
