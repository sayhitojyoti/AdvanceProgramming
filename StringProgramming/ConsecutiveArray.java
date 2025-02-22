package com.StringProgramming;

public class ConsecutiveArray {
    public static void main(String[] args) {
        String s = "success";
        char[] a = s.toCharArray();
        int i = 0;
        
        while (i < a.length) {
            char c = a[i];
            String str = c + "";  // Initialize str with the current character
            i++;
            
            // Find consecutive characters
            while (i < a.length && a[i] == c) {
                str += c;
                i++;
            }
            
            // Print if more than one consecutive character found
            if (str.length() > 1) {
                System.out.println(str);
            }
        }
    }
}
