package com.company;

public class EmployeeTest {
    public static void main(String[] args) throws TooManyHoursWorkedException {
        Employee john = new Employee("John", "Smith", 101, 35);
        try {
        System.out.println("Payment for 40: " + john.computePay(40));
        System.out.println("Payment for 23: " + john.computePay(23));
        System.out.println("Payment for 1: " + john.computePay(1));
        System.out.println("Payment for 0: " + john.computePay(0));
        System.out.println("Payment for -5: " + john.computePay(-5));
        System.out.println("Payment for 45: " + john.computePay(45));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

