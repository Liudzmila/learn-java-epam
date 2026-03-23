package main.java.com.epam.learn.designpatterns.behavioral.command;

public class App {

    public static void main(String[] args) {
        var light = new Light();

        var lightOperationExecutor = new LightOperationExecutor();

        light.isOn();
        lightOperationExecutor.doOperation(new LightOnOperation(light));
        light.isOn();
        lightOperationExecutor.doOperation(new LightOffOperation(light));
        light.isOn();

//        light.isOn();
//        light.turnOnLight();
//        light.isOn();
//        light.turnOffLight();
//        light.isOn();
    }
}
