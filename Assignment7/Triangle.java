package com.company;

public class Triangle extends Shape2D {
    private double height = 0;
    private double base = 0;

    Triangle (double h, double b) {
        height = h;
        base = b;
    }

    //setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //getters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double computeArea() {
        return (0.5 * base * height);
    }
}
