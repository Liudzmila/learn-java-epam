package main.java.com.epam.learn.designpatterns.behavioral.visitor;

public class AdultTicket implements TicketElement {

    private int price = 10;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
