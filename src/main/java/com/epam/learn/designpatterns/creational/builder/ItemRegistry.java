package main.java.com.epam.learn.designpatterns.creational.builder;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem.ItemBuilder("Pretzel", 2.0)
                .shortDescription("A tasty snack")
                .longDescription("a type of baked pastry made from dough that is commonly shaped into a knot." +
                        " The traditional pretzel shape is a distinctive symmetrical form," +
                        " with the ends of a long strip of dough intertwined and then twisted " +
                        "back onto itself in a particular way (a pretzel loop or pretzel bow). " +
                        "Today, pretzels come in various shapes, textures, and colors, " +
                        "but the original soft pretzel remains one of the most common pretzel types.")
                .stockAvailable(1000)
                .packagingType("Paper bag")
                .build();

        var item2 = new StoreItem.ItemBuilder("Soup", 1.5)
                .longDescription("A primarily liquid food, generally served warm or hot – though it" +
                        " is sometimes served chilled – made by cooking or otherwise combining meat " +
                        "or vegetables with stock, milk, or water.")
                .packagingType("Can")
                .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }
}
