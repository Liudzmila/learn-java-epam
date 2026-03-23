package main.java.com.epam.learn.designpatterns.structural.decorator;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        var roomWithCarpetAndCouch = new RoomWithCouch(room);
        roomWithCarpetAndCouch.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch, and a table
        var roomWithCarpetCouchAndTable = new RoomWithTable(roomWithCarpetAndCouch);
        roomWithCarpetCouchAndTable.printFurniture();
    }
}
