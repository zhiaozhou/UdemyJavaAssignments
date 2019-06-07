package com.zhiao;

public class Main {

    public static void main(String[] args) {
	// byte
    // short
    // int
    // long
    // float
    // double
    // char
    // boolean

    String myString = "This is a string";
    System.out.println("myString is equal to " + myString);
    myString = myString + ", and this is more.";
    System.out.println("myString is equal to " + myString);
    myString  += "\u00A9 2015";
    System.out.println("myString is equal to " + myString);

    String numberString = "250.55";
    numberString += "49.45";
    System.out.println("The result is " + numberString);

    String lastString = "10";
    int myInt = 50;
    // 把int加到str的时候，java会自动转换int为str
    lastString += myInt;
    System.out.println("The result is " + lastString);
    long myLong = 2341231243242L;
    lastString += myLong;
    System.out.println("The result is " + lastString);
    }
}
