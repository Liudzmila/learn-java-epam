package main.java.com.epam.learn.designpatterns.behavioral.chainofresponsibility;

public class UsDollarATM extends ATM {

    public UsDollarATM(ATM nextATM) {
        super(nextATM);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.USD) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (request != null) {
            nextATM.dispense(request);
        }
    }
}
