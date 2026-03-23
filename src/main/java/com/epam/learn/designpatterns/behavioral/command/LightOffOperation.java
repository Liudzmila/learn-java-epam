package main.java.com.epam.learn.designpatterns.behavioral.command;

public class LightOffOperation implements LightOperation {

    private final Light light;

    public LightOffOperation(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }
}
