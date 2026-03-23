package com.epam.learn.main.oop.abstraction;

public class Main {

    public static void main(String[] args) {
        PasswordChangeEvent passwordChangeEvent = new PasswordChangeEvent("54664655133211");
        AccountTransferEvent accountTransferEvent = new AccountTransferEvent("2154646232132");
        MissedPaymentEvent missedPaymentEvent = new MissedPaymentEvent("546843111321");

        Event[] events = {passwordChangeEvent, accountTransferEvent, missedPaymentEvent};

        for (Event e : events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
