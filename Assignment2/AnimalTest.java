package com.company;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", "Chappie", 2, 1, "ground", 5.6);
        Raccoon raccoon = new Raccoon("Raccoon", "Roby", 1, 1, "forest", 2.3);
        Cat cat = new Cat("Cat", "Mary", 3, 2, "city", 3.5);
        Whale whale = new Whale("Whale", "Willie", 13, 1, "ocean", 14.7);

        dog.bark();
        dog.eat();
        dog.greetHuman();
        dog.move();
        dog.sleep();
        dog.walk();
        dog.sound();

        System.out.println();
        System.out.println("***************************************");
        System.out.println();

        cat.eat();
        cat.greetHuman();
        cat.move();
        cat.scratch();
        cat.sleep();
        cat.sound();
        cat.walk();

        System.out.println();
        System.out.println("***************************************");
        System.out.println();

        raccoon.eat();
        raccoon.move();
        raccoon.scratch();
        raccoon.sleep();
        raccoon.sound();

        System.out.println();
        System.out.println("***************************************");
        System.out.println();

        whale.eat();
        whale.move();
        whale.sleep();
        whale.sound();
        whale.swim();
    }
}
