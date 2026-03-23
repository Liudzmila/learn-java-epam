package main.java.com.epam.learn.designpatterns.creational.singleton;

public class Cat {
    private final Logger logger = Logger.getInstance();

    public void meow() {
        logger.log("Meow");
    }
}
