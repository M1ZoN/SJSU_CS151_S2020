package com.company;

public class ProductTest {
    public static void main(String[] args) {
        Product brownEgg = new Product("Brown eggs", "Raw organic brown eggs in a basket", 5, 2.5);
        Product strawberry = new Product("Sweet fresh stawberry", "Sweet fresh stawberry on the wooden table", 10, 6.5);
        Product pesto = new Product("Pesto with Basil", "Italian traditional pesto with basil, chesse and oil", 7, 10.5);

        System.out.println(brownEgg.toString());
        System.out.println();
        System.out.println("**********************************************");
        System.out.println();

        System.out.println(strawberry.toString());
        System.out.println();
        System.out.println("**********************************************");
        System.out.println();

        System.out.println(pesto.toString());
    }
}
