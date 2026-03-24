package main.java.com.epam.learn.designpatterns.behavioral.strategy;

public class CheckoutPage {

    public void pay(PaymentStrategy strategy) {
        strategy.pay();
    }
}
