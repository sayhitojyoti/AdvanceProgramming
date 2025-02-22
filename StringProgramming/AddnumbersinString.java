package com.StringProgramming;

public class AddnumbersinString {

    public static void main(String[] args) {
        String s = "ab12c34d56";
        int sum = 0;
        String s1 = ""; // to collect digits as a string

        for (int i = 0; i < s.length(); i++) { // Remove the extra semicolon here
            char ch = s.charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                s1 += ch; // build the number as a string
            } else {
                if (!s1.isEmpty()) { // if there’s a collected number, add it to the sum
                    sum += Integer.parseInt(s1);
                    s1 = ""; // reset for the next number
                }
            }
        }

        // Add the last collected number, if any
        if (!s1.isEmpty()) {
            sum += Integer.parseInt(s1);
        }

        System.out.println("Sum of numbers in string: " + sum);
    }
}
