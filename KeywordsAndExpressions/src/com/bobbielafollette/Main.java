package com.bobbielafollette;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");

            int score = 100;
            if (score > 99) {
                System.out.println("You got the high score!");
                score = 100;
            }
            // These are expressions:
            // score = 100
            // score > 99
            // You got the high score!
            // score = 0
        }
    }
}