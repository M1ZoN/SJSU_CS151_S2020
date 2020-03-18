package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        FileWriter myOutput = null;
        Scanner sc = new Scanner(System.in);
        String input = "";
        String toFile = "";
        boolean isExit = false;

        try {
            myOutput = new FileWriter("command_line_input.txt");
            do {
                input = sc.nextLine();
                toFile = input;
                if (input.contains("@a"))  {
                    toFile = input.substring(0, input.indexOf("@a"));
                    isExit = true;
                }
                myOutput.write(toFile);
            } while (!isExit);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (myOutput != null) {
                myOutput.close();
            }
        }
    }
}
