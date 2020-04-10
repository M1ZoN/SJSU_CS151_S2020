package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShapeTest implements Runnable{
    public static void main(String[] args) {
        ShapeTest st = new ShapeTest();
        Thread t1 = new Thread(st);
        t1.start();

    }

    @Override
    public void run() {
        Shape2D s1 = new Circle(20);
        Shape2D s2 = new Circle(15);
        Shape2D s3 = new Hexagon(25);
        Shape2D s4 = new Hexagon(5);
        Shape2D s5 = new Rectangle(2, 5);
        Shape2D s6 = new Rectangle(4, 5);
        Shape2D s7 = new Triangle(10, 5);
        Shape2D s8 = new Triangle(7, 12);

        Shapes sh = new Shapes();
        sh.add(s1);
        sh.add(s2);
        sh.add(s3);
        sh.add(s4);
        sh.add(s5);
        sh.add(s6);
        sh.add(s7);
        sh.add(s8);

        //Serialization EXERCISE-3
        for (int i = 1; i <= 8; i++) {
            String filename = "obj" + i + ".ser";
            try {
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(sh.getShapeList().get(i - 1));

                out.close();
                file.close();

                System.out.println("Serialization finished");
            } catch (IOException e) {
                System.out.println("IOException is caught");
            }
        }

        //------------------------

        sh.compute();

        //EXERCISE-2
        sh.max();
        sh.min();
        //----------
    }
}
