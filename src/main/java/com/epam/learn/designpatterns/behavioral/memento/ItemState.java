package main.java.com.epam.learn.designpatterns.behavioral.memento;

public class ItemState {

    private int price;

    public ItemState(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
