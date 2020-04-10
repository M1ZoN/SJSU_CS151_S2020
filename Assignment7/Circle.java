package com.company;

import java.lang.annotation.Inherited;

public class Circle extends Shape2D{
    private double radius = 0;

    Circle(double radius) {
        this.radius = radius;
    }

    //setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //getters
    public double getRadius() {
        return radius;
    }

    @Override
    public double computeArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
