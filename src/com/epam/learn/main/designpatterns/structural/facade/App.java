package com.epam.learn.main.designpatterns.structural.facade;

public class App {

    public static void main(String[] args) {

        SendMessageFacade sendMessageFacade = new SendMessageFacade();
        sendMessageFacade.sendMessage();
    }
}
