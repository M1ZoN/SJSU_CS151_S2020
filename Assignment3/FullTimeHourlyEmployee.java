package com.company;

public class FullTimeHourlyEmployee extends Employee {
    FullTimeHourlyEmployee(){super();}
    FullTimeHourlyEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    FullTimeHourlyEmployee(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
    }

    FullTimeHourlyEmployee(String firstName, String lastName, int age, int SSN, Address address, int id, String accommodation, double rate) {
        super(firstName, lastName, age, SSN, address, id, accommodation);
        this.rate = rate;
    }

    public double computePay(double hours) {
        return (hours * rate);
    }

    @Override
    public String toString() {
        return "Hey! I am Full Time Hourly Employee\n" + super.toString() + "\n" +  "Hourly rate: " + rate;
    }

    @Override
    public void introduce() {
        System.out.println(this.toString());
    }
    private double rate = 0;
}
