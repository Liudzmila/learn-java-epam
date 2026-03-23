package main.java.com.epam.learn.designpatterns.structural.decorator;

public class RoomWithTable extends RoomDecorator {

    public RoomWithTable(Room room) {
        super(room);
    }

    @Override
    public void printFurniture() {
        super.printFurniture();
        System.out.println("Table");
    }
}
