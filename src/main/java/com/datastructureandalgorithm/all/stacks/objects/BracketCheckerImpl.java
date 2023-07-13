package com.datastructureandalgorithm.all.stacks.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BracketCheckerImpl {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString(); // read a string from kbd
            if (input.equals("")) // quit if [Enter]
                break;

            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check(); // check brackets
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
