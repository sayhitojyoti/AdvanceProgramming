package com.StringProgramming;

public class Removeextraspaces {

    public static void main(String[] args) {
        String input = "   Java   is   very   easy   ";
        String result = "";
        boolean spaceFound = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If current character is not a space, add it to result
            if (currentChar != ' ') {
                result += currentChar;
                spaceFound = false; // Reset space flag as we are in a word
            } else if (!spaceFound) { // If space is found and no previous space in result
                result += "";
                spaceFound = true; // Set space flag to ignore further spaces
            }
        }

        // Trim any leading or trailing space
        if (result.length() > 0 && result.charAt(0) == ' ') {
            result = result.substring(1); // Remove leading space
        }
        if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
            result = result.substring(0, result.length() - 1); // Remove trailing space
        }

        System.out.println(result);
    }
}
