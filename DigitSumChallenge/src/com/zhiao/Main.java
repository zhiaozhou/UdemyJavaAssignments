package com.zhiao;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1258));
    }

    public static int sumDigits(int number) {
        if (!(number>=10) || (number < 0)) {
            return -1;
        } else {
            int division = 1;
            int sum = 0;
            while (!(division==0)) {
                division = number % 10;
                sum += division;
                number /= 10;
            }
        return sum;
        }
    }
}
