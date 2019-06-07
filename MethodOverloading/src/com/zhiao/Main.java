package com.zhiao;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unamed player scored " + score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1d;
        } else {
            double centimeters = (feet * 12 + inches) * 2.54;
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = -1;
        if (inches < 0) {
            return feet;
        }
        feet = (int) inches / 12;
        return feet;
    }
}
