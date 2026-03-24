package main.java.com.epam.learn.designpatterns.behavioral.visitor;

public class DiscountVisitor implements Visitor {

    @Override
    public void visit(AdultTicket adultTicket) {
        adultTicket.setPrice(adultTicket.getPrice() / 2);
    }

    @Override
    public void visit(GroupTicket groupTicket) {
        groupTicket.getElements().forEach(e -> e.accept(this));
    }
}
