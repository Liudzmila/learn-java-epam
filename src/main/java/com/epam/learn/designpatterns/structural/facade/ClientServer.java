package main.java.com.epam.learn.designpatterns.structural.facade;

public class ClientServer extends Authenticator {

    public void authenticateClient() {
        super.authenticate();
        System.out.println("client...");
    }

    public void routeToRecipient() {
        System.out.println("Routing to recipient...");
    }
}
