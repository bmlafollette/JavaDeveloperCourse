package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {

        //Create a class and demonstrate proper encapsulation techniques.
        // The class will be called printer.
        // It will simulate a real computer printer.
        // It should have fields for the toner level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number od pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
