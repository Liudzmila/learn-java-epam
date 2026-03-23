package main.java.com.epam.learn.designpatterns.structural.decorator;

public class BasicRoom implements Room {

    @Override
    public void printFurniture() {
        System.out.println("Carpet");
    }
}
