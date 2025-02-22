package com.StringProgramming;

public class VowelCharacter {

    public static void main(String[] args) {
        String input = "Hello World";
        String missingVowels = findMissingVowels(input);  // Get missing vowels
        System.out.println(missingVowels);                // Print result in main
    }

    public static String findMissingVowels(String input) {
        // Arrays to track each vowel presence in lowercase and uppercase
        boolean[] foundLowercaseVowels = new boolean[5]; // For a, e, i, o, u
        boolean[] foundUppercaseVowels = new boolean[5]; // For A, E, I, O, U

        // Check each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case 'a': foundLowercaseVowels[0] = true; break;
                case 'e': foundLowercaseVowels[1] = true; break;
                case 'i': foundLowercaseVowels[2] = true; break;
                case 'o': foundLowercaseVowels[3] = true; break;
                case 'u': foundLowercaseVowels[4] = true; break;
                case 'A': foundUppercaseVowels[0] = true; break;
                case 'E': foundUppercaseVowels[1] = true; break;
                case 'I': foundUppercaseVowels[2] = true; break;
                case 'O': foundUppercaseVowels[3] = true; break;
                case 'U': foundUppercaseVowels[4] = true; break;
            }
        }

        // Check for missing lowercase and uppercase vowels
        String missingVowels = "";
        if (!foundLowercaseVowels[0]) missingVowels += "a ";
        if (!foundUppercaseVowels[0]) missingVowels += "A ";
        if (!foundLowercaseVowels[1]) missingVowels += "e ";
        if (!foundUppercaseVowels[1]) missingVowels += "E ";
        if (!foundLowercaseVowels[2]) missingVowels += "i ";
        if (!foundUppercaseVowels[2]) missingVowels += "I ";
        if (!foundLowercaseVowels[3]) missingVowels += "o ";
        if (!foundUppercaseVowels[3]) missingVowels += "O ";
        if (!foundLowercaseVowels[4]) missingVowels += "u ";
        if (!foundUppercaseVowels[4]) missingVowels += "U ";

        // Return result
        return missingVowels.isEmpty() ? "All vowels are present." : "Missing vowels: " + missingVowels.trim();
    }
}
