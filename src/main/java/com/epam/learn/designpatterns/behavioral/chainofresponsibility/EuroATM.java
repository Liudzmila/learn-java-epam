package main.java.com.epam.learn.designpatterns.behavioral.chainofresponsibility;

public class EuroATM extends ATM {

    public EuroATM(ATM nextATM) {
        super(nextATM);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.EUR) {
            System.out.println("Dispensing €" + request.getAmount());
        } else if (nextATM != null) {
            nextATM.dispense(request);
        }
    }
}
