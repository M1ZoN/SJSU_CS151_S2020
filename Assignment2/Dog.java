package com.company;

public class Dog extends Animal implements Action, Domestic {

    Dog(String type, String name, int age, int gender, String environment, double speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public void sound() {
        System.out.println(this.getType() + " " + this.getName() + " makes a sound.");
    }

    @Override
    public void move() {
        System.out.println(this.getType() + " " + this.getName() + " moves with a speed " + this.getSpeed());
    }

    @Override
    public void eat() {
        System.out.println(this.getType() + " " + this.getName() + " eats something.");
    }

    @Override
    public void sleep() {
        System.out.println(this.getType() + " " + this.getName() + " sleeps.");
    }

    public void bark() {
        System.out.println(this.getType() + " " + this.getName() + " barks.");
    }

    @Override
    public void walk() {
        System.out.println(this.getType() + " " + this.getName() + " walks with Human.");
    }

    @Override
    public void greetHuman() {
        System.out.println(this.getType() + " " + this.getName() + " greets a Human.");
    }
}
