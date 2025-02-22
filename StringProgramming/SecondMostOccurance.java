package com.StringProgramming;

public class SecondMostOccurance {

    public static void main(String[] args) {
        String input = "jaaavvaa";
        char result = findSecondMostOccurrence(input);
        if (result != '\0') {
            System.out.println("The second most occurring character is: " + result);
        } else {
            System.out.println("No second most occurring character found.");
        }
    }

    public static char findSecondMostOccurrence(String input) {
        int[] frequency = new int[256];  
        for (char ch : input.toCharArray()) {
            frequency[ch]++;
        }

        int firstMax = 0, secondMax = 0;
        char secondMostChar = '\0';
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > firstMax) {
                secondMax = firstMax;
                firstMax = frequency[i];
            } else if (frequency[i] > secondMax && frequency[i] < firstMax) {
                secondMax = frequency[i];
                secondMostChar = (char) i;
            }
        }

        return secondMostChar;
    }
}
