package com.zhiao;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int count = 0;
        while (number <=  20) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println(number);
            count++;
        }
        System.out.println(count);
    }

    public static boolean isEvenNumber(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }
}
