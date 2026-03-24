package main.java.com.epam.learn.designpatterns.behavioral.visitor;

public interface Visitor {

    void visit(AdultTicket adultTicket);

    void visit(GroupTicket groupTicket);
}
