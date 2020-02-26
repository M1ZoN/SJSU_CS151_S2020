package com.company;

public class FullTimeSalaryEmployee extends Employee{
    FullTimeSalaryEmployee(){super();}
    FullTimeSalaryEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    FullTimeSalaryEmployee(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
    }

    FullTimeSalaryEmployee(String firstName, String lastName, int age, int SSN, Address address, int id, String accommodation, double compensation) {
        super(firstName, lastName, age, SSN, address, id, accommodation);
        this.compensation  = compensation;
    }

    private double compensation = 0;

    public double computePay(double week) {
        return compensation * week;
    }

    @Override
    public String toString() {
        return "Hey! I am Full Time Salary Employee\n" + super.toString() + "\n" +  "Compensation: " + compensation;
    }

    @Override
    public void introduce() {
        System.out.println(this.toString());
    }
}
