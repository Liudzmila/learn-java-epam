package main.java.com.epam.learn.designpatterns.structural.flyweight;

public class Garden {

    public static void main(String[] args) {
        // uncomment and see the difference
//        var sunflower1 = new Flower("Sunflower");
//        var sunflower2 = new Flower("Sunflower");
//        var sunflower3 = new Flower("Sunflower");
//        System.out.println(sunflower1);
//        System.out.println(sunflower2);
//        System.out.println(sunflower3);
//
//        var rose1 = new Flower("Rose");
//        var rose2 = new Flower("Rose");
//        var rose3 = new Flower("Rose");
//        System.out.println(rose1);
//        System.out.println(rose2);
//        System.out.println(rose3);

        // using the Flyweight pattern (using the cache) instead of creating of new objects
        var sunflower1 = FlowerFactory.createFlower("Sunflower");
        var sunflower2 = FlowerFactory.createFlower("Sunflower");
        var sunflower3 = FlowerFactory.createFlower("Sunflower");
        System.out.println(sunflower1);
        System.out.println(sunflower2);
        System.out.println(sunflower3);

        var rose1 = FlowerFactory.createFlower("Rose");
        var rose2 = FlowerFactory.createFlower("Rose");
        var rose3 = FlowerFactory.createFlower("Rose");
        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);
    }
}
