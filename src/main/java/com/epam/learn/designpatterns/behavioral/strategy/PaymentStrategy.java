package main.java.com.epam.learn.designpatterns.behavioral.strategy;

public interface PaymentStrategy {

    void pay();

    PaymentStrategy payWithCardStrategy = () -> System.out.println("Payment made with card");
    PaymentStrategy payByBankTransfer = () -> System.out.println("Payment made by bank transfer");
}
