package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {

    public static void main(String[]args) throws IOException {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("quote.txt");
            int data = fileReader.read();
            do {
                System.out.print((char)data);
                data = fileReader.read();
            } while (data != -1);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}