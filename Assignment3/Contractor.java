package com.company;

public class Contractor extends Employee {
    Contractor(){super();}
    Contractor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    Contractor(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
    }

    Contractor(String firstName, String lastName, int age, int SSN, Address address, int id, String accommodation, double rate) {
        super(firstName, lastName, age, SSN, address, id, accommodation);
        this.rate = rate;
    }

    public double computePay(double hours) {
        return (hours * rate);
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return   "Hey! I am Contractor\n" + super.toString() + "\n" +  "Hourly rate: " + rate;
    }

    @Override
    public void introduce() {
        System.out.println(this.toString());
    }

    private double rate = 0;
}
