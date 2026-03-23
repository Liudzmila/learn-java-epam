package com.epam.learn.main.designpatterns.creational.abstractfactory;

public class RedScrollBar implements ScrollBar {
    @Override
    public String getColor() {
        return "RED";
    }
}
