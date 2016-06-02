package com.bobbielafollette;

/**
 * Created by Bobbie on 6/2/2016.
 */
// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible {
    int SOME_CONSTANT = 100;
    public  void method();
    void methodB();
    boolean methodC();
}

// All are public (interfaces are public).
