package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        // 7 decimals
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        // doubles often run faster
        // many built-in functions use doubles
        // 16 decimals
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double myPounds = 50d;
        double myTotal = myPounds * 0.45359237d;
        System.out.println("myPounds in kilograms = " + myTotal);
    }
}
