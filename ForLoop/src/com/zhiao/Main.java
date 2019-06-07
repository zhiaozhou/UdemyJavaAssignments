package com.zhiao;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for(int i=100; i<=2000; i++) {
            if (isPrime(i)) {
                count += 1;
                System.out.println(i);
            }
            if (count == 3) {
                break;
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
