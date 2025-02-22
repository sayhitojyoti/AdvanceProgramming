package com.StringProgramming;

public class ReversewithoutSplitmethod {

    public static void main(String[] args) {
        String S = "java is very very easy";
        String temp = "";
        int end = S.length();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == ' ' || i == 0) { 
                int start = (i == 0) ? i : i + 1; 
                for (int j = start; j < end; j++) {
                    temp += S.charAt(j);
                }
                if (i != 0) {
                    temp += ' ';
                }
                end = i;
            }
            
        }   
        System.out.println(temp);
    }
}
