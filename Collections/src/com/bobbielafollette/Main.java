package com.bobbielafollette;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Olympian", 8, 12);
//        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
//        printList(seatCopy);
//
        if(theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theater.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00", 13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);

//        Collections.shuffle(seatCopy);                 // can use reverse or shuffle
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theater.seat");
//        printList(theater.seats);
//
//        Theater.Seat minSet = Collections.min(seatCopy);
//        Theater.Seat maxSet = Collections.max(seatCopy);
//        System.out.println("Min seat number is " + minSet.getSeatNumber());
//        System.out.println("Max seat number is " + maxSet.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
//
//        List<Theater.Seat> newList = new ArrayList<>(theater.seats.size());
//        Collections.copy(newList, theater.seats);
//
//        theater.getSeats();
//        if(theater.reserveSeat("B13")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theater.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }

    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("************************************************************");
    }

//    public static void sortList(List<? extends Theater.Seat> list) {
//        for(int i=0; i<list.size() -1; i++) {
//            for(int j=i+1; j<list.size(); j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
