package com.company;

public class Rectangle extends Shape2D {

    private double width = 0;
    private double height = 0;

    Rectangle(double w, double h) {
        height = h;
        width = w;
    }

    //setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //getters

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double computeArea() {
        return (height * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
