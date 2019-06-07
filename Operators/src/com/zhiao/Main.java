package com.zhiao;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result/5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result++;
        System.out.println(previousResult + " + 1 = " + result);

        previousResult = result;
        result--;
        System.out.println(previousResult + " - 1 = " + result);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien");
        else
            System.out.println("cao");

        int topScore = 100;
        if (topScore > 100)
            System.out.println("You got the high score!");

        int secondTopScore = 180;
        if ((topScore > secondTopScore) & (secondTopScore < 100))
            System.out.println("You got the right answer!");

        if ((topScore > 90) || (secondTopScore <= 20))
            System.out.println("One of these tests is true!");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? false : true;
        System.out.println(wasCar);


        double doubleVar = 20d;
        double secondDoubleVar = 80d;
        double sumOfThem = (doubleVar + secondDoubleVar) * 25;
        double remainder = sumOfThem % 40;
        if (remainder <= 20)
            System.out.println("Total was over the limit");
    }
}
