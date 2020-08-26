package com.company;

public class VipCustomer {
    private String name;
    private double CreditLimit;
    private String email;

    public VipCustomer() {
        this("default",1000000,"default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"ashjkw@gmail.com");
        this.name = name;
        CreditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        CreditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        CreditLimit = creditLimit;
        this.email = email;
    }
}
