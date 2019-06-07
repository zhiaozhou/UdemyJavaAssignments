package com.zhiao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contacts();
    }

    public static MobilePhone mobilePhone = new MobilePhone();

    public static void Contacts() {

        printInstructions();
        boolean quit = false;

        while (quit != true) {
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    System.out.print("Enter a new name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter a new number: ");
                    long number = scanner.nextLong();
                    scanner.nextLine();
                    if ((mobilePhone.searchContact(name)>=0)||(mobilePhone.searchContact(number)>=0)) {
                        System.out.println("Cannot add them because this person is already in your contact book!");
                    } else {
                        mobilePhone.addName(name);
                        mobilePhone.addNumber(number);
                    }
                    break;
                case 3:
                    System.out.print("Please enter the name or the number of the person that you want to edit: ");
                    String input = scanner.nextLine();
                    if (input.matches("\\d+")) {
                        long searchContent =  Long.parseLong(input);
                        /* user inputs the number */
                        System.out.print("Enter the new name: (blank if unchanged)");
                        String newName = scanner.nextLine();
                        System.out.print("Enter the new number: (0 if unchanged)");
                        long newNumber = scanner.nextLong();
                        scanner.nextLine();
                        if (newName.equals("")) {
                            mobilePhone.modifyContact(searchContent,newNumber);
                        } else {
                            if (newNumber == 0) {
                                mobilePhone.modifyContact(searchContent,newName);
                            } else {
                                mobilePhone.modifyContact(searchContent,newName,newNumber);
                            }
                        }
                     } else {
                        String searchContent = input;
                        /* user inputs the name */
                        System.out.print("Enter the new name: (blank if unchanged)");
                        String newName = scanner.nextLine();
                        System.out.print("Enter the new number: (0 if unchanged)");
                        long newNumber = scanner.nextLong();
                        scanner.nextLine();
                        if (newName.equals("")) {
                            mobilePhone.modifyContact(searchContent,newNumber);
                        } else {
                            if (newNumber == 0) {
                                mobilePhone.modifyContact(searchContent,newName);
                            } else {
                                mobilePhone.modifyContact(searchContent,newName,newNumber);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter the names or numbers: ");
                    input = scanner.nextLine();
                    if (input.matches("\\d+")) {
                        long searchContent = Long.parseLong(input);
                        mobilePhone.removeContact(searchContent);
                    } else {
                        String searchContent = input;
                        mobilePhone.removeContact(searchContent);
                    }
                    break;
                case 5:
                    System.out.print("Enter the names or numbers: ");
                    input = scanner.nextLine();
                    if (input.matches("\\d+")) {
                        long searchContent = Long.parseLong(input);
                        int index = mobilePhone.searchContact(searchContent);
                        if (index >= 0) {
                            System.out.println(searchContent + " has been found at index " + index);
                        } else {
                            System.out.println(searchContent + " has not been found");
                        }
                        } else {
                        String searchContent = input;
                        int index = mobilePhone.searchContact(searchContent);
                        if (index >= 0) {
                            System.out.println(searchContent + " has been found at index " + index);
                        } else {
                            System.out.println(searchContent + " has not been found");
                        }
                    }
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of the contact book.");
        System.out.println("\t 2 - To add an item to the contact book.");
        System.out.println("\t 3 - To modify an item in the contact book.");
        System.out.println("\t 4 - To remove an item from the contact book.");
        System.out.println("\t 5 - To search for an item in the contact book.");
        System.out.println("\t 6 - To quit the application.");
    }
}
