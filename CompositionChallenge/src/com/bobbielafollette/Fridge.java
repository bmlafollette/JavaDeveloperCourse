package com.bobbielafollette;

/**
 * Created by Bobbie on 5/25/2016.
 */
public class Fridge {
    private int cubicFeet;
    private Dimensions freezerDimensions;

    public Fridge(int cubicFeet, Dimensions freezerDimensions) {
        this.cubicFeet = cubicFeet;
        this.freezerDimensions = freezerDimensions;
    }

    public void isRunning() {
        System.out.println("The stove is running");
    }

    public int getCubicFeet() {
        return cubicFeet;
    }

    public Dimensions getFreezerDimensions() {
        return freezerDimensions;
    }
}
