package com.java21days;

import java.io.*;

public class ConsoleInput {
    public static String readLine() {
        StringBuilder response = new StringBuilder();
        try (BufferedInputStream buff = new
            BufferedInputStream(System.in)) {

            int in;
            char inChar;
            do {
                in = buff.read();
                inChar = (char) in;
                if ((in != -1) & (in != '\n') & (in != '\r')) {
                    response.append(inChar);
                }
            } while ((in != -1) & (inChar != '\n') & (in != '\r'));
            buff.close();
            return response.toString();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] arguments) {
        System.out.print("\nWhat is your name? ");
        String input = ConsoleInput.readLine();
        System.out.println("\nHello, " + input);
    }
}