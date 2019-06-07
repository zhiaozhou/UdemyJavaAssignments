package com.zhiao;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        } else {
            int hour = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hour + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes,remainingSeconds);
        }
    }
}
