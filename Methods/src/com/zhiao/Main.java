package com.zhiao;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
	    int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);


        String playerName = "yoyo";
        int playerScore = 1500;
        int highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);
        playerScore = 900;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);
        playerScore = 400;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);
        playerScore = 50;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);
    }


    // void 表示，不要return任何value
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " +
                playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
