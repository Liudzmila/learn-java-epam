package main.java.com.epam.learn.designpatterns.creational.abstractfactory;

public class RedUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new RedScrollBar();
    }
}
