package com.company;

public class StudentTest {
    public static void main(String[] args) {
        Student john = new Student("John", "Smith", " Computer Science major", "Computer Science department", 20, 3.6);
        Student johnCopy = john;
        john.printInfo();
        System.out.println();
        System.out.println();
        System.out.println();
        johnCopy.printInfo();
    }
}
