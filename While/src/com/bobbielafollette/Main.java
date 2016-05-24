package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        /*for(int i=1; i<7; i++) {
            System.out.println("Count value is " + count);
        }*/

        /*count = 1;
        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }*/

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

        int countNum = 0;
        int num = 5;
        int finishNumber = 20;
        while(num <= finishNumber) {
            if(!isEvenNumber(num)){
                num++;
                continue;
            }
            System.out.println("Even number " + num);
            num++;

            countNum++;
            if(countNum >= 5) {
                break;
            }
        }

        System.out.println("Total number of even numbers found: " + countNum);
    }

    public static boolean isEvenNumber(int num) {
        if((num % 2) == 0) {
            return true;
        }
        return false;
    }
}
