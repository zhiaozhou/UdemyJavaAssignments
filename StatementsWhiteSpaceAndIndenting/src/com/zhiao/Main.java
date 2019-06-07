package com.zhiao;

public class Main {

    public static void main(String[] args) {
        // myVariable = 50是expression，整句话是一个statement
	    boolean myVariable = true;

        System.out.println("test" +
                "if this can be run validly" +
                "still more.");

        int test = myVariable ? 5 : 2;
        System.out.println(test);

        int firstVar = 50; firstVar--;System.out.println(firstVar);

    }
}
