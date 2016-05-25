package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(42, 46, 30);

        Burners burners = new Burners(2, 2);

        Stove theStove = new Stove("Whirlpool", burners);

        Fridge theFridge = new Fridge(10, dimensions);

        Sink theSink = new Sink("Stainless steel");

        KitchenRoom theKitchenRoom = new KitchenRoom(theStove, theFridge, theSink);
        theKitchenRoom.powerStove();

        theKitchenRoom.getFridge().isRunning();
    }
}
