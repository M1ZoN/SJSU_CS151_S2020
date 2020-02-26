package com.company;

public class Customer extends Person {

    Customer() {
        super();
    }

    Customer(String firstName,  String lastName) {
        super(firstName, lastName);
    }

    Customer(String firstName, String lastName,  Address address) {
        super(firstName, lastName, address);
    }

    Customer(String firstName, String lastName,  Address address, String paymentMethod) {
        super(firstName, lastName, address);
        this.paymentMethod = paymentMethod;
    }

    Customer(String firstName, String lastName, int age, int SSN, Address address, int id, String paymentMethod) {
        super(firstName, lastName, age, SSN, address, id);
        this.paymentMethod = paymentMethod;
    }


        //getter
    public String getPaymentMethod() {
        if (paymentMethod == "")
            throw new IllegalArgumentException("Cannot be empty");
        return paymentMethod;
    }

    //setter
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    @Override
    public String toString() {
        String  res = "";
        res += "Hey! I am customer\n" + super.toString() + "\n" + "Payment method preferred: '" + paymentMethod;
        return (res);
    }

    @Override
    public void introduce() {
        System.out.println(this.toString());
    }

    public void makePayment() {
        System.out.println("Payment method preferred: '" + paymentMethod);
    }

    private String paymentMethod = "";
}
