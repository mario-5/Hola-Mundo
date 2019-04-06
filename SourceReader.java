package com.java21days;

import java.io.*;

public class SourceReader {
    public static void main(String[] arguments) {
        try (
            FileReader file = new
                FileReader("SourceReader.java");
            BufferedReader buff = new
                BufferedReader(file)) {

            boolean eof = false;
            while (!eof) {
                String line = buff.readLine();
                if (line == null) {
                    eof = true;
                } else {
                    System.out.println(line);
                }
            }
            buff.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
    }
}