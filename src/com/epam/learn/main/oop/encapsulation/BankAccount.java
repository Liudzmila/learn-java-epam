package com.epam.learn.main.oop.encapsulation;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public double withdraw(double sum) {
        if (sum > balance || sum < 0) {
            throw new IllegalArgumentException("invalid sum");
        }
        this.balance = this.balance - sum;
        return this.balance;
    }

    public double deposit(double sum) {
        if (sum < 0) {
            throw new IllegalArgumentException("invalid sum");
        }
        this.balance = this.balance + sum;
        return this.balance;
    }
}
