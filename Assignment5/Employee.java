package com.company;

class TooManyHoursWorkedException extends Exception {
    public TooManyHoursWorkedException(String s) {
        super(s);
    }
}

public class Employee {
    private String firstName = "";
    private String lastName = "";
    private int id = 0;
    private double rate = 0;

    Employee(String firstName, String lastName, int id, double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.rate = rate;
    }

    //setters
    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getters
    public int getId() {
        return id;
    }

    public double getRate() {
        return rate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double computePay(int hours) throws TooManyHoursWorkedException {
        if (hours < 0)
            throw new NumberFormatException("Cannot be negative!");
        else if (hours > 40)
            throw new TooManyHoursWorkedException("Cannot exceed 40 hours per week");
        return (hours * rate);
    }
}
