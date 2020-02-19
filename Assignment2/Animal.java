package com.company;

import com.sun.source.tree.UsesTree;

public class Animal {

    Animal(String type, String name, int age, int gender, String environment, double speed) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.environment = environment;
        this.speed = speed;
    }

    //---Setters---

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    //-------------

    //---Getters---

    public String getType() {
        return type;
    }

    public String getEnvironment() {
        return environment;
    }

    public int getGender() {
        return gender;
    }

    public double getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    //--------------


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", environment='" + environment + '\'' +
                ", speed=" + speed +
                '}';
    }

    private String type = "";
    private String name = "";
    private int age = 0;
    private int gender = 0;
    private String environment = "";
    private double speed = 0;
}
