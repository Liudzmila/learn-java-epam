package main.java.com.epam.learn.designpatterns.creational.abstractfactory;

public class RedScrollBar implements ScrollBar {
    @Override
    public String getColor() {
        return "RED";
    }
}
