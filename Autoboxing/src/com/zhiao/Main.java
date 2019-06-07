package com.zhiao;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	   Branch branch = new Branch("Brooklyn Downtown");
	   branch.addCustomer(new Customer("吕萌萌"), 28888);
	   branch.addCustomer(new Customer("吕悠悠"), 38888888);
	   branch.addTransactionForCustomer("吕萌萌",13.28);
	   branch.printCustomers(true);

    }
}

class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
        System.out.println(name + " has successfully added a " + amount + "-dollar transaction ");
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

class Branch {
    private ArrayList<Customer> branch;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branch = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(Customer customer, double initialTransaction) {
        int index = searchOf(customer.getName());
        if (index == -1) {
            customer.addTransaction(initialTransaction);
            branch.add(customer);
        } else {
            System.out.println(customer.getName() + " is already in the branch!");
        }

    }

    public int searchOf(String name) {
        for (int i=0;i<branch.size();i++) {
             Customer customer = branch.get(i);
             if (customer.getName().equals(name)) {
                 return i;
             }
        }
        return -1;
    }

    public void addTransactionForCustomer(String name, double amount) {
        int customerPosition = searchOf(name);
        if (customerPosition >= 0) {
            branch.get(customerPosition).addTransaction(amount);
        } else {
            System.out.println(name + " does not exist in this branch!");
        }
    }

    public void printCustomers(boolean showTransaction) {
        if (showTransaction) {
            System.out.println("-------------------");
            System.out.println(branchName + " branch has the following customers: ");
            System.out.println("-------------------");
            for (int i=0;i<branch.size();i++) {
                Customer customer = branch.get(i);
                System.out.println((i+1) + ". " + customer.getName() + " -- " + customer.getTransactions().toString());
            }
            System.out.println("-------------------");
        } else {
            System.out.println("-------------------");
            System.out.println(branchName + " branch has the following customers: ");
            System.out.println("-------------------");
            for (int i=0;i<branch.size();i++) {
                Customer customer = branch.get(i);
                System.out.println((i+1) + ". " + customer.getName());
            }
            System.out.println("-------------------");
        }
    }
}
