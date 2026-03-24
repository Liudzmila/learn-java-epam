package main.java.com.epam.learn.designpatterns.behavioral.strategy;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.pay(PaymentStrategy.payWithCardStrategy);
        checkoutPage.pay(PaymentStrategy.payByBankTransfer);

    }
}
