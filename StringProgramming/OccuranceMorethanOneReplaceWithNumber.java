package com.StringProgramming;

public class OccuranceMorethanOneReplaceWithNumber {

    public static void main(String[] args) {
        String input = "hello world";
        String output = replaceWithFrequency(input);
        System.out.println(output);
    }

    public static String replaceWithFrequency(String input) {
        int[] frequency = new int[256]; // Array for ASCII character frequencies
        StringBuilder result = new StringBuilder();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            frequency[ch]++;
        }

        // Build the output string
        for (char ch : input.toCharArray()) {
            if (frequency[ch] > 1) {
                result.append(frequency[ch]); // Append frequency if greater than 1
            } else if (ch != ' ') {
                result.append(ch); // Append the character if it occurs once
            } else {
                result.append(' '); // Preserve spaces
            }
        }

        return result.toString();
    }
}
