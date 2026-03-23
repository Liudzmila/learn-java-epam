package main.java.com.epam.learn.designpatterns.behavioral.command;

public class LightOnOperation implements LightOperation {

    private final Light light;

    public LightOnOperation(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }
}
