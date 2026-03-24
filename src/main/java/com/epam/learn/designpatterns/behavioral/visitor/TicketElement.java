package main.java.com.epam.learn.designpatterns.behavioral.visitor;

public interface TicketElement {

    int getPrice();

    void accept(Visitor visitor);
}
