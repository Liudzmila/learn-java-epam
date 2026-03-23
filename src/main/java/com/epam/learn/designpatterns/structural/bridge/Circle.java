package main.java.com.epam.learn.designpatterns.structural.bridge;

public class Circle implements Shape {

    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void getType() {
        System.out.println("Circle");
    }

    @Override
    public Color getColor() {
        return color;
    }
}
