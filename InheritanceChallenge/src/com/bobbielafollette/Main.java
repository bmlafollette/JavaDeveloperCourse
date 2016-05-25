package com.bobbielafollette;

public class Main extends Object {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("red", 4, 6);

        Car myCar = new Car("blue", 4, 4, "sedan", "leather");

        Honda myHonda = new Honda("green", 4, 5, "sedan", "cloth", "LX");

        myVehicle.changingGears("manually");
        myCar.steering("fast");
        myCar.windowsTinted();
        myHonda.speakerSystem();

        // Challenge.
        // Start with a base class of a vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to handle steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviors (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For your specific type of vehicle you will want to add something specific for that type of car.
    }
}
