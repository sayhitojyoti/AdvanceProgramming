package com.StringProgramming;

public class ReplaceWithFrequency {

    public static void main(String[] args) {
        String input = "hello world";
        String output = replaceWithFrequency(input);
        System.out.println(output); // Should print: he1l2o world
    }

    public static String replaceWithFrequency(String input) {
        int[] frequency = new int[256]; // Array for ASCII character frequencies
        int[] occurrenceCount = new int[256]; // Array for occurrence tracking
        StringBuilder result = new StringBuilder();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            frequency[ch]++;
        }

        // Build the output string
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                result.append(' '); // Preserve spaces
            } else {
                occurrenceCount[ch]++;
                if (frequency[ch] > 1) {
                    result.append(occurrenceCount[ch]); // Append occurrence number if frequency > 1
                } else {
                    result.append(ch); // Append the character if it occurs once
                }
            }
        }

        return result.toString();
    }
}
