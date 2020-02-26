package com.company;

public class Person {

    Person() {
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    Person(String firstName, String lastName, int age, int SSN, Address address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.SSN = SSN;
        this.address = address;
        this.id = id;
    }

    //Getters

    public boolean isVisibleSSN() {
        return visibleSSN;
    }

    public String getLastName() {
        if (lastName == "")
            throw new IllegalArgumentException("Cannot be empty");
        return lastName;
    }

    public String getFirstName() {
        if (firstName == "")
            throw new IllegalArgumentException("Cannot be empty");
        return firstName;
    }

    public int getSSN() {
        if (SSN == 0)
            throw new IllegalArgumentException("Cannot be empty");
        return SSN;
    }

    public int getId() {
        if (id == 0)
            throw new IllegalArgumentException("Cannot be empty");
        return id;
    }

    public int getAge() {
        if  (age == 0)
            throw new IllegalArgumentException("Cannot be empty");
        return age;
    }

    public Address getAddress() {
        return address;
    }
    //-------------

    //Setters
    public void setVisibleSSN(boolean visibleSSN) {
        this.visibleSSN = visibleSSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //-----------


    @Override
    public String toString() {
        String  res = "";
        res += "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                ((visibleSSN) ? ("SSN: " + SSN + "\n") : "" ) +
                "id: " + id + "\n" +
                "address: " + address.toString();
        return res;
    }

    public void introduce() {
        System.out.println(this.toString());
    }

    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private int SSN = 0;
    private boolean  visibleSSN  = false;
    private Address address = new Address();
    private int id = 0;

}
