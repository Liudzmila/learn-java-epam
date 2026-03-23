package com.epam.learn.main.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static final Map<String, Supplier<UIFactory>> uiTypes = new HashMap<>();

    static {
        uiTypes.put("BLUE", BlueUIFactory::new);
        uiTypes.put("RED", RedUIFactory::new);
    }

    public static UIFactory createUIFactory(String uiType) {
        if (uiTypes.get(uiType) != null) {
            return uiTypes.get(uiType).get();
        } else {
            throw new IllegalArgumentException("Color not supported");
        }
    }
}
