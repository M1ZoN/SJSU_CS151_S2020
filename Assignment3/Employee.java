package com.company;

public class Employee extends Person {
    Employee() {
        super();
    }

    Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    Employee(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
    }

    Employee(String firstName, String lastName, int age, int SSN, Address address, int id, String accomodation) {
        super(firstName, lastName, age, SSN, address, id);
        this.accommodation = accomodation;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +  "Accommodation: " + accommodation;
    }

    @Override
    public void introduce() {
        System.out.println(this.toString());
    }

    private String accommodation = "";
}
