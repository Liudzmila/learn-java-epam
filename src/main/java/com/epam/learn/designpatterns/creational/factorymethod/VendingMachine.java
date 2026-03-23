package main.java.com.epam.learn.designpatterns.creational.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>();

    static {
        snackMap.put("ChocolateBar", ChocolateBar::new);
        snackMap.put("Chips", Chips::new);
        snackMap.put("Drink", Drink::new);
    }

    Snack getSnack(String snackType) {
        if (snackMap.get(snackType) != null) {
            return snackMap.get(snackType).get();
        } else {
            throw new IllegalArgumentException("The snack type doesn't exist!");
        }
    }
}
