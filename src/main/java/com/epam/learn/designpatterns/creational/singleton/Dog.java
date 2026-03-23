package main.java.com.epam.learn.designpatterns.creational.singleton;

public class Dog {
    private final Logger logger = Logger.getInstance();

    public void woof() {
        logger.log("Woof");
    }
}
