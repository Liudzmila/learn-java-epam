package com.epam.learn.main.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

    private static final Map<String, Flower> FLOWER_CACHE = new HashMap<>();

//    public static Flower createFlower(String name) {
//        return FLOWER_CACHE.computeIfAbsent(name, Flower::new);
//    }

    // this is the SAME LOGIC of the computeIfAbsent method of HashMap
    public static Flower createFlower(String name) {
        if (FLOWER_CACHE.containsKey(name)) {
            return FLOWER_CACHE.get(name);
        }

        var flower = new Flower(name);
        FLOWER_CACHE.put(name, flower);
        return flower;
    }
}
