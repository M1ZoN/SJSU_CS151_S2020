package com.company;

import java.util.Map;

public class Hexagon extends Shape2D{

    private double side = 0;

    Hexagon(double side) {
        this.side = side;
    }

    //setters
    public void setSide(double side) {
        this.side = side;
    }

    //getters
    public double getSide() {
        return side;
    }

    @Override
    public double computeArea() {
        return (3 * Math.sqrt(3) / 2 * Math.pow(side, 2));
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "side=" + side +
                '}';
    }
}
