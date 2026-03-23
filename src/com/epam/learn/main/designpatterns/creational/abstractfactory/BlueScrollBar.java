package com.epam.learn.main.designpatterns.creational.abstractfactory;

public class BlueScrollBar implements ScrollBar {
    @Override
    public String getColor() {
        return "BLUE";
    }
}
