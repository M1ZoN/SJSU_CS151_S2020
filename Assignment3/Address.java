package com.company;

public class Address {

    Address(String streetName, int streetNumber, int zip, String state){
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zip = zip;
        this.state = state;
    }

    Address() {
    }

    //Getters
    public int getStreetNumber() {
        if (streetNumber == 0)
            throw new IllegalArgumentException("Cannot be empty");
        return streetNumber;
    }

    public int getZip() {
        if (zip == 0)
            throw new IllegalArgumentException("Cannot be empty");
        return zip;
    }

    public String getState() {
        if (state == "")
            throw new IllegalArgumentException("Cannot be empty");
        return state;
    }

    public String getStreetName() {
        if (streetName == "")
            throw new IllegalArgumentException("Cannot be empty");
        return streetName;
    }
    //--------

    //Setters
    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setState(String state) {
        this.state = state;
    }
    //--------


    @Override
    public String toString() {
        return  (streetNumber + " " + streetName + ", " + zip + ", " + state);
    }

    private String streetName = "";
    private int streetNumber = 0;
    private int zip = 0;
    private String state = "";

}
