package main.java.com.epam.learn.designpatterns.structural.facade;

public class RecipientServer extends Authenticator {

    public void authenticateRecipient() {
        super.authenticate();
        System.out.println("recipient...");
    }

    public void sendMessage() {
        System.out.println("Sending message...");
    }
}
