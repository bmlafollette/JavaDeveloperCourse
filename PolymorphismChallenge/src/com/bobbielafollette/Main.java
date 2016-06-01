package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {

        // We are going to go back to the car analogy.
        // Create a base class called Car.
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true.  Cylinders and names would be passed parameters.
        // Create appropriate getters.
        // Create some methods like startEngine accelerate, and brake
        // Show a message for each in the base class.
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // Put all classes in the one java file (this one).

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mustang mustang = new Mustang(8, "Fastback");
        System.out.println(mustang.startEngine());
        System.out.println(mustang.accelerate());
        System.out.println(mustang.brake());

        Jeep Jeep = new Jeep(6, "Grand Cherokee");
        System.out.println(Jeep.startEngine());
        System.out.println(Jeep.accelerate());
        System.out.println(Jeep.brake());

        Lexus lexus = new Lexus(6, "RX");
        System.out.println(lexus.startEngine());
        System.out.println(lexus.accelerate());
        System.out.println(lexus.brake());
    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mustang extends Car {

    public Mustang(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mustang -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mustang -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mustang -> brake()";
    }
}

class Jeep extends Car {

    public Jeep(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Jeep -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Jeep -> accelerate()";
    }

    @Override
    public String brake() {
        return "Jeep -> brake()";
    }
}

class Lexus extends Car {

    public Lexus(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}
