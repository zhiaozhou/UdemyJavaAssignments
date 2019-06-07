package com.zhiao;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] Array = new int[] {4,23,643,1,24,21};
        System.out.println("Reversed array is " + Arrays.toString(reverse(Array)));
    }

    public static int[] reverse(int[] Array) {
        int[] reversedArray = new int[Array.length];
        for (int i=0;i<Array.length;i++) {
            reversedArray[Array.length-i-1] = Array[i];
        }
        return reversedArray;
    }
}
