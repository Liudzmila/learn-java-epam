package com.epam.learn.main.designpatterns.creational.abstractfactory;

public class App {

    public static void main (String[] args) {
        UserInterface redUserInterface = createUserInterface("RED");
        UserInterface blueUserInterface = createUserInterface("BLUE");

        System.out.println(redUserInterface);
        System.out.println(blueUserInterface);
    }

    private static UserInterface createUserInterface(String color) {
        // creating a factory for factories
        var uiFactory = FactoryMaker.createUIFactory(color);

        // creating the needed object (UI) depending on the argument passed (color)
        var button = uiFactory.createButton();
        var scrollBar = uiFactory.createScrollBar();

        return new UserInterface(button, scrollBar);
    }
}
