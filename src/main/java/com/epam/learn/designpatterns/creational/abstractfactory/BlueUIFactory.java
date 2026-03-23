package main.java.com.epam.learn.designpatterns.creational.abstractfactory;

public class BlueUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new BlueScrollBar();
    }
}
