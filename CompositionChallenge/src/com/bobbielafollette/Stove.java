package com.bobbielafollette;

/**
 * Created by Bobbie on 5/25/2016.
 */
public class Stove {
    private String model;
    private Burners numberofBurners;

    public Stove(String model, Burners numberofBurners) {
        this.model = model;
        this.numberofBurners = numberofBurners;
    }

    public void turnStoveOn() {
        System.out.println("Stove turned on");
    }

    public String getModel() {
        return model;
    }

    public Burners getNumberofBurners() {
        return numberofBurners;
    }
}
