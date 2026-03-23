package main.java.com.epam.learn.designpatterns.behavioral.command;

public class LightOperationExecutor {

    public void doOperation(LightOperation lightOperation) {
        lightOperation.execute();
    }
}
