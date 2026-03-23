package main.java.com.epam.learn.designpatterns.behavioral.chainofresponsibility;

public abstract class ATM {

    public final ATM nextATM;

    public ATM(ATM nextATM) {
        this.nextATM = nextATM;
    }

    public abstract void dispense(WithdrawalRequest request);
}
