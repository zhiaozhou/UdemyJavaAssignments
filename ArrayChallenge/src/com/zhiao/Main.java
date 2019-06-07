package com.zhiao;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] Array = getIntegers(5);
	    printArray(Array);
        System.out.println("After sorting it: \r");
	    printArray(sortIntegers(Array));
    }

    public static int[] getIntegers(int length) {
        System.out.println("Please type in some integers: \r");
        Scanner scanner = new Scanner(System.in);
        int[] Array = new int[length];
        for (int i=0;i<length;i++) {
            int input = scanner.nextInt();
            Array[i] = input;
        }
        return Array;
    }

    public static void printArray(int[] Array) {
        for (int i=0;i<Array.length;i++) {
            System.out.println("Array element " + i + " is " + Array[i]);
        }
    }

    public static int[] sortIntegers(int[] Array) {
//        int[] ultimateArray = new int[Array.length];
//
//        for (int i=0;i<Array.length;i++) {
//            ultimateArray[i] = Array[i];
//        }
        int[] ultimateArray = Arrays.copyOf(Array,Array.length);
//        int[] ultimateArray = Array;


        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0;i<ultimateArray.length-1;i++) {
                if (ultimateArray[i]<ultimateArray[i+1]) {
                    temp = ultimateArray[i];
                    ultimateArray[i] = ultimateArray[i+1];
                    ultimateArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return ultimateArray;
    }
}
