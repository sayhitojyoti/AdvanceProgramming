package com.StringProgramming;

public class RemoveDuplicatesWithoutBUiltinMethod {

    public static void main(String[] args) {
        String s = "javadeveloper";
        System.out.println(removeDuplicates(s)); // Expected output: "jv"
    }

    public static String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        String result = "";
        
        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            int count = 0;

            // Count occurrences of current character
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == current) {
                    count++;
                }
            }

            // If the character appears only once, add it to the result
            if (count == 1) {
                result += current;
            }
        }
        
        return result;
    }
}