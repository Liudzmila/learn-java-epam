package main.java.com.epam.learn.designpatterns.behavioral.chainofresponsibility;

public class WithdrawalRequest {

    private final Double amount;
    private final Currency currency;

    public WithdrawalRequest(Double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public enum Currency {
        USD,
        EUR
    }
}
