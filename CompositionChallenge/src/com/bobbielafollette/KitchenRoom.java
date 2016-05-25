package com.bobbielafollette;

/**
 * Created by Bobbie on 5/25/2016.
 */
public class KitchenRoom {

    private Stove theStove;
    private Fridge theFridge;
    private Sink theSink;

    public KitchenRoom(Stove theStove, Fridge theFridge, Sink theSink) {
        this.theStove = theStove;
        this.theFridge = theFridge;
        this.theSink = theSink;
    }

    public void powerStove() {
        theStove.turnStoveOn();
    }

    public Fridge getFridge() {
        return this.theFridge;
    }

    public Sink getTheSink() {
        return theSink;
    }
}
