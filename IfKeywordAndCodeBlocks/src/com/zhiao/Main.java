package com.zhiao;

public class Main {

    public static void main(String[] args) {
//	    int testVar = 5000;
//	    if (testVar > 10000){
//            System.out.println("The variable is greater than 10000.");
//        } else if (testVar <= 10000 && testVar > 5000) {
//            System.out.println("The variable is less or equal than 10000 and greater than 5000.");
//        } else {
//            System.out.println("The variable is less or equal than 5000.");
//        }

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // java在if block中的变量 在if结束后不会被保留
        // int savedFinalScore = finalScore;



    }
}
