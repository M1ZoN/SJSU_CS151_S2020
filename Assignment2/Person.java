package com.company;

public class Person {

    Person(String firstName, String lastName, int age, int socialSecurityNumber, String address, char gender, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }

    //-------------------Setters-------------------


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //---------------------------------------------


    //-------------------Getters-------------------


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getAddress() {
        return address;
    }

    //---------------------------------------------


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                '}';
    }

    void introduce() {
        System.out.println("Hello! My name is " + this.firstName + " " + this.lastName + ".");
        System.out.println("I am " + this.age + " years old.");
        System.out.println("I will not say you my SSN. Because it is my private number.");
        System.out.println("My address is " + this.address + ".");
        System.out.println("I am " + ((this.gender == 'm')?"male" : "female") + ".");
        System.out.println("And my weight is " + this.weight + ".");
    }

    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private int socialSecurityNumber = 0;
    private String address = "";
    private char gender = 'x';
    private double weight = 0;
}
