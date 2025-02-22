package com.StringProgramming;

public class Replacewith$ {

    public static void main(String[] args) {
        String input = "BOSS";
        String output = replaceWithDollarFromSecondOccurrence(input);
        System.out.println(output); // Expected output: hel$o wor$d
    }

    public static String replaceWithDollarFromSecondOccurrence(String input) {
        int[] occurrenceCount = new int[256]; // Array for ASCII character occurrences
        StringBuilder result = new StringBuilder();

        // Build the output string
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                result.append(' '); // Preserve spaces
            } else {
                occurrenceCount[ch]++;
                if (occurrenceCount[ch] > 1) {
                    result.append('$'); // Replace with $ if it's the second occurrence or beyond
                } else {
                    result.append(ch); // Append the character on first occurrence
                }
            }
        }

        return result.toString();
    }
}
