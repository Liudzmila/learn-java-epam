package com.epam.learn.main.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(250000, "John");
        bankAccount.withdraw(1500);
        //bankAccount.deposit(1500);
        System.out.println(bankAccount.getBalance());
    }
}
