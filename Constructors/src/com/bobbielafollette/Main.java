package com.bobbielafollette;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(); //(12345, "Bobbie LaFollette", "myemail@gmail.com", "765-123-4567");
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());

        myAccount.setBalance(1000.00);
        myAccount.depositFunds(200.0);
        myAccount.withdrawFunds(100.0);

        myAccount.withdrawFunds(100.0);

        BankAccount jordansAccount = new BankAccount("Jordan", "jordan@elevenfifty.org", "123-456-7890");
        System.out.println(jordansAccount.getAccountNumber() + " name " + jordansAccount.getCustomerName());

        VipCustomer kennethVip = new VipCustomer("Kenneth", 900.00, "kenneth@elevenfifty.org");
        System.out.println("Name: " + kennethVip.getName() + ", Credit limit: " + kennethVip.getCreditLimit() + ", Email: " + kennethVip.getEmailAddress());
    }
}
