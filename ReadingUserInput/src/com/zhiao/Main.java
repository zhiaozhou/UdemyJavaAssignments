package com.zhiao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        int yearOfBirth = scanner.nextInt();

        System.out.println("Enter your month of birth: ");
        int monthOfBirth = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("The name is " + name);
        scanner.close();
    }
}
