package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        int switchChar = 'F';
        switch(switchChar) {
            case 'A':
                System.out.println("Character was A");
                break;

            case 'B':
                System.out.println("Character was B");
                break;

            case 'C':
                System.out.println("Character was C");
                break;

            case 'D':case 'E':
                System.out.println("Character was D or E");
                break;

            default:
                System.out.println("Character was not A, B, C, D, or E");
                break;
        }

        String month = "JANUARY";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
            case "february":
                System.out.println("Feb");
            default:
                System.out.println("Not sure");
        }
    }
}
