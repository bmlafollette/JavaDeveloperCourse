package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {

        // int had a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //byte had a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShortValue = (short) (myMinShortValue / 2);

        // long has a width of 64
        long myLongValue = 100L;
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;

        byte myByte = 5;
        short myShort = 100;
        int myInt = 25;
        long myLong = 50000L + (10L * (myByte + myShort + myInt));
        System.out.println(myLong);
    }
}
