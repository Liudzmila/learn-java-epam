package main.java.com.epam.learn.designpatterns.behavioral.memento;

public class Item {

    private int price;
    private ItemState itemState = new ItemState(price);

    public Item(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void save() {
        itemState.setPrice(price);
    }

    public void undo() {
        price = itemState.getPrice();
    }
}
