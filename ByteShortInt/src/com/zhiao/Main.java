package com.zhiao;

public class Main {

    public static void main(String[] args) {
        byte myByteVar = 127;
        short myShortVar = 11111;
        int myIntVar = 123456;
        long myLongVar = (50000L + 10L * (myByteVar + myIntVar + myShortVar));
        System.out.println("My long variable is " + myLongVar);
    }
}
