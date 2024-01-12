package com.mimaraslan;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        String programInput = readFromInput();
        String programOutput = getPenultimateWord(programInput);
        System.out.println(programOutput);
    }

    private static String readFromInput() {
        Scanner input = new Scanner(System.in);
        String inString = input.nextLine();
        return inString;
    }

    private static String getPenultimateWord(String inputString) {
        String[] words = inputString.split("\\s+");

        if (words.length >= 2) {
            return words[words.length - 2];
        } else {
            return "Not enough words";
        }
    }
}
