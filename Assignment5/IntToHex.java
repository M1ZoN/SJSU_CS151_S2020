package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToHex {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Please input your number to convert to hex: ");
            num = sc.nextInt();
            System.out.printf("Your number " + num + " will convert to hex as: " + Integer.toHexString(num));
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Illegal input");
        }
    }
}
