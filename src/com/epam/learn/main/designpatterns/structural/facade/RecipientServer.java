package com.epam.learn.main.designpatterns.structural.facade;

public class RecipientServer extends Authenticator {

    public void authenticateRecipient() {
        super.authenticate();
        System.out.println("recipient...");
    }

    public void sendMessage() {
        System.out.println("Sending message...");
    }
}
