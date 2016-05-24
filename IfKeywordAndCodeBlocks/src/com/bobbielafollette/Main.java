package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            // could optionally exclude the curly braces since everything is on one line
//            System.out.println("Your score was 5000");
//        } else if (score < 1000){
//            System.out.println("Your score was les sthan 1000");
//        } else {
//            System.out.println("Got here");
//        }
//        System.out.println("This was executed");


        // same as if (gameOver == true)
        if (gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
