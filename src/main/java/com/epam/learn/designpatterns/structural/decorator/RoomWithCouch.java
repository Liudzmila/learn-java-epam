package main.java.com.epam.learn.designpatterns.structural.decorator;

public class RoomWithCouch extends RoomDecorator {

    public RoomWithCouch(Room room) {
        super(room);
    }

    @Override
    public void printFurniture() {
        super.printFurniture();
        System.out.println("Couch");
    }
}
