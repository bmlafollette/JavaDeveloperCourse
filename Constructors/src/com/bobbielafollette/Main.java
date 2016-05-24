package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        myAccount.depositFunds(50);
        myAccount.withdrawFunds(100.0);
    }
}
