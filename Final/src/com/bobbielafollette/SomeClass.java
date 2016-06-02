package com.bobbielafollette;

/**
 * Created by Bobbie on 6/2/2016.
 */
public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;
    // marked final, cannot be assign value anywhere else one set, also prevents subclassing

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(" created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
