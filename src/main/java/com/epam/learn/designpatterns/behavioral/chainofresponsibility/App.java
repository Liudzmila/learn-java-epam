package main.java.com.epam.learn.designpatterns.behavioral.chainofresponsibility;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20.0, WithdrawalRequest.Currency.USD);
        var atm = buildChain();
        atm.dispense(request);
    }

    private static ATM buildChain() {
        var usdATM = new UsDollarATM(null);
        var eurATM = new EuroATM(usdATM);
        return eurATM;
    }
}
