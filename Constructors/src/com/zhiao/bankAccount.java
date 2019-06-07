package com.zhiao;

public class bankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public bankAccount(long accountNumber, double balance, String customerName, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void deposit(double funds) {
        this.balance += funds;
        System.out.println("The balance now is " + this.balance);
    }

    public void withdraw(double funds) {
        if (this.balance >= funds) {
            this.balance -= funds;
            System.out.println("The balance now is " + this.balance);
        } else {
            System.out.println("You don't have enough money to withdraw!");
        }
    }
}