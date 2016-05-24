package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Bobbie", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(5, 2);
        System.out.println("Centimeters is " + centimeters);

        centimeters = calcFeetAndInchesToCentimeters(7);
        System.out.println("Inches is " + centimeters);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >=0 && inches <=12) {
            return (feet * 12 * 2.54) + (inches * 2.54);
        } else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0) {
            return (inches / 12);
        } else {
            return -1;
        }
    }

    /*public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
    }*/

}

