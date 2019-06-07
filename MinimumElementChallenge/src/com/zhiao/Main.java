package com.zhiao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] Array = readIntegers(6);
        System.out.println("The minimum value in the array is " + findMin(Array));
    }

    public static int[] readIntegers(int count) {
        System.out.println("Please enter integers: \r");
        Scanner scanner = new Scanner(System.in);
        int[] Array = new int[count];
        for (int i=0;i<count;i++) {
            Array[i] = scanner.nextInt();
        }
        return Array;
    }

    public static int findMin(int[] Array) {
        int min = Integer.MAX_VALUE;
        for (int i=0;i<Array.length;i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        return min;
    }

}
