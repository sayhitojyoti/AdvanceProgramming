package com.StringProgramming;

public class Init {

    public static void main(String[] args) {
        String s = "Java";
        char[] a = s.toCharArray();
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = (char) (a[i] + 32); // Convert uppercase to lowercase
            } else if (a[i] >= 'a' && a[i] <= 'z') {
                a[i] = (char) (a[i] - 32); // Convert lowercase to uppercase
            }
        }
        
        String s2 = new String(a);
        System.out.print(s2);
    }
}
