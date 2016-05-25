package com.bobbielafollette;

/**
 * Created by Bobbie on 5/25/2016.
 */
public class Honda extends Car {

    private String modelPackage;

    public Honda(String color, int doors, int cylinders, String model, String seatMaterial, String modelPackage) {
        super(color, doors, cylinders, model, seatMaterial);
        this.modelPackage = modelPackage;

    }


    public void speakerSystem() {
        System.out.println("Honda.speakerSystem() called");
        super.changingGears("slow");
    }
}
