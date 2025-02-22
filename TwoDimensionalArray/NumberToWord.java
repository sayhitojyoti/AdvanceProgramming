package com.TwoDimensionalArray;

public class NumberToWord {
    public static void main(String[] args) {
        int num = 255024961;
        pw(num / 10000000, " crore ");
        pw((num / 100000) % 100, " lakh ");
        pw((num / 1000) % 100, " thousand ");
        pw((num / 100) % 10, " hundred ");
        pw(num % 100, "");
    }

    public static void pw(int num, String s) {
        String[] one = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        
        String[] two = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
        if (num > 0) {
            if (num <= 19) {
                System.out.print(one[num] + " ");
            } else {
                System.out.print(two[num / 10] + " " + one[num % 10] + " ");
            }
            System.out.print(s);
        } 
    }
}
