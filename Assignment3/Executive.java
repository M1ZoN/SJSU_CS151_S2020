package com.company;

public class Executive extends Employee {
    Executive(){super();}
    Executive(String firstName, String lastName) {
        super(firstName, lastName);
    }

    Executive(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
    }

    Executive(String firstName, String lastName, int age, int SSN, Address address, int id, String accommodation, double compensation, double bonus) {
        super(firstName, lastName, age, SSN, address, id, accommodation);
        this.compensation = compensation;
        this.bonus = bonus;
    }

    //setters
    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //getters
    public double getCompensation() {
        return compensation;
    }

    public double getBonus() {
        return bonus;
    }

    private double compensation = 0;
    private double bonus = 0;

    @Override
    public String toString() {
        return  "Hey! I am executive\n" + super.toString() + "\n" +  "Compensation: " + compensation + "\n" + "Bonus: " + bonus;
    }

    @Override
    public void introduce() {
        System.out.println(this.toString());
    }

    public double computePay() {
        return compensation + bonus;
    }
}
