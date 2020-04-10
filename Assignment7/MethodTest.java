package com.company;

import java.util.ArrayList;

public class MethodTest {
    public static void main(String[] args) {
        ArrayList<String>s = new ArrayList<>();
        ArrayList<Integer>i = new ArrayList<>();
        ArrayList<Double>d = new ArrayList<>();

        s.add("5");
        s.add("5");
        s.add("5");
        s.add("5");
        s.add("5");

        i.add(6);
        i.add(6);
        i.add(6);
        i.add(6);
        i.add(6);
        i.add(6);

        d.add(8.8);
        d.add(8.8);
        d.add(8.8);
        d.add(8.8);
        d.add(8.8);
        d.add(8.8);
        d.add(8.8);
        d.add(8.8);

        System.out.println("Count of stringList: " + count(s));
        System.out.println("Count of integerList: " + count(i));
        System.out.println("Count of doubleList: " + count(d));
    }


    public static <T> int count(ArrayList<T> list) {
        return (list.size());
    }
}
