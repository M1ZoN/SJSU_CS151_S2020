package com.company;

public class Employee extends Person {

    Employee(String firstName, String lastName, int age, int socialSecurityNumber, String address, char gender, double weight, int employeeId, String startDate, int employeeStatus, int duration,  double payment) {
        super(firstName, lastName, age, socialSecurityNumber, address, gender, weight);
        this.employeeId = employeeId;
        this.employeeStatus = employeeStatus;
        this.startDate = startDate;
        this.duration = duration;
        if (this.employeeStatus == 1 || this.employeeStatus == 2)
            this.hourlyPay = payment;
        else if (this.employeeStatus == 3)
            this.yearlySalary = payment;
    }

    //-------------------Setters-------------------

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeStatus(int employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setPayment(double payment) {
        if (this.employeeStatus == 1 || this.employeeStatus == 2)
            this.hourlyPay = payment;
        else if (this.employeeStatus == 3)
            this.yearlySalary = payment;

    }
    //---------------------------------------------


    //-------------------Getters-------------------

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double getPayment() {
        double res = 0;
        if (this.employeeStatus == 1 || this.employeeStatus == 2)
            res  = this.hourlyPay;
        else if (this.employeeStatus == 3)
            res = this.yearlySalary;
        return  res;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getEmployeeStatus() {
        return employeeStatus;
    }

    public String getStartDate() {
        return startDate;
    }

    //---------------------------------------------

    double calculatePay() {
        double res = 0;
        if (this.employeeStatus == 1 || this.employeeStatus == 2)
            res  = this.hourlyPay * this.duration;
        else if (this.employeeStatus == 3)
            res = this.yearlySalary / 12;
        return  res;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("My employee id: " + this.employeeId);
        System.out.println("I am working here since: " + this.startDate);
        System.out.println("My total salary per month is: " + this.calculatePay());
        if (this.employeeStatus == 1 || this.employeeStatus == 2)
            System.out.println("I am " + ((this.employeeStatus == 1) ? "Contractor" : "Part Time") + " worker.");
        else if (this.employeeStatus == 3)
            System.out.println("I am a full time worker.");
    }

    private int employeeId = 0;
    private int employeeStatus = 0;
    private String startDate = "";
    private double hourlyPay = 0;
    private double yearlySalary = 0;
    private int duration = 0;
}
