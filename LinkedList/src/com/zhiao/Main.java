package com.zhiao;

import java.util.ArrayList;

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Tim",44);
	    Customer anotherCustomer;
	    anotherCustomer = customer;
	    anotherCustomer.setBalance(12.18);

        System.out.println("Blance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(2);
        intList.add(8);

        for (int i=0;i<intList.size();i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);

        for (int i=0;i<intList.size();i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
