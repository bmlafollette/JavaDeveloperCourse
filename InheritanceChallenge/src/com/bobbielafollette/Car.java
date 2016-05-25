package com.bobbielafollette;

/**
 * Created by Bobbie on 5/25/2016.
 */
public class Car extends Vehicle {

    private String model;
    private String seatMaterial;

    public Car(String color, int doors, int cylinders, String model, String seatMaterial) {
        super(color, doors, cylinders);
        this.model = model;
        this.seatMaterial = seatMaterial;
    }

    public void windowsTinted() {
        System.out.println("Car.windowsTinted() called");
        super.moving(100);
    }

    @Override
    public void steering(String steer) {
        System.out.println("Car.steering() called");
        super.steering(steer);
    }
}
