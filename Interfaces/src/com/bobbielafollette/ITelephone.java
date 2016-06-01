package com.bobbielafollette;

/**
 * Created by Bobbie on 5/31/2016.
 */
public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
