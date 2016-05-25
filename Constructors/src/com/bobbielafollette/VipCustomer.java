package com.bobbielafollette;

/**
 * Created by Bobbie on 5/25/2016.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 5000.00, "default@gmail.com");
        System.out.println("Empty constructor");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 1000.00, emailAddress);
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
