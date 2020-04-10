package com.company;

import java.util.ArrayList;

public class Shapes {
    private ArrayList<Shape2D>shapeList = new ArrayList<>();

    Shapes() {
    }

    Shapes(ArrayList<Shape2D>shapeList) {
        this.shapeList = shapeList;
    }

    //setters
    public void setShapeList(ArrayList<Shape2D> shapeList) {
        this.shapeList = shapeList;
    }

    //getters
    public ArrayList<Shape2D> getShapeList() {
        return shapeList;
    }

    public void add(Shape2D shape) {
        shapeList.add(shape);
    }

    public void remove(Shape2D shape) {
        shapeList.remove(shape);
    }

    //----------------------EXERCISE-2-----------------------------------
    public double max() {
        double res = shapeList.get(0).computeArea();
        Shape2D m = shapeList.get(0);

        for (Shape2D shape2D : shapeList) {
            if (shape2D.computeArea() > res) {
                m = shape2D;
                res = shape2D.computeArea();
            }
        }
        System.out.println(m.toString() + " has the biggest Area: " + res);
        return res;
    }

    public double min() {
        double res = shapeList.get(0).computeArea();
        Shape2D m = shapeList.get(0);

        for (Shape2D shape2D : shapeList) {
            if (shape2D.computeArea() < res) {
                m = shape2D;
                res = shape2D.computeArea();
            }
        }
        System.out.println(m.toString() + " has the biggest Area: " + res);
        return res;
    }
    //---------------------------------------------------------------------

    public void compute() {
        for (int i = 0; i < shapeList.size(); i++) {
            Shape2D shape = shapeList.get(i);
            System.out.println( (i + 1) + " shape's area: " + String.format("%.2f",shape.computeArea()));
        }
    }
}
