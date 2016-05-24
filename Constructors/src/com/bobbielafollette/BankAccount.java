package com.bobbielafollette;

/**
 * Created by Bobbie on 5/24/2016.
 */
public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.getEmail();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.getPhoneNumber();
    }

    /*public void depositFunds(double deposit) {
        double newBalance = this.balance + deposit;
        setBalance(newBalance);
        System.out.println(this.balance);
    }*/

    public void depositFunds(double deposit) {
        this.balance += deposit;
    }

    /*public void withdrawFunds(double withdrawal) {
        if(withdrawal > this.balance) {
            System.out.println("You do not have enough money in the account.");
        } else {
            double newBalance = this.balance - withdrawal;
            setBalance(newBalance);
            System.out.println(this.balance);
        }
    }*/

    public void withdrawFunds(double withdrawal) {
        if(this.balance - withdrawal <= 0) {
            System.out.println("You only have " + this.balance + " available.");
        } else {
            this.balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + " processed.  Remaining balance = " + this.balance);
        }
    }
}
