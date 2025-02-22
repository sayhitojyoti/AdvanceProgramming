package com.TwoDimensionalArray;

public class PascalsTraiangle {

    public static void main(String[] args) {
        int num = 5;
        int[][] a = new int[num][];
        isPascal(a);
        
        int sp = num - 1;
        for (int[] row : a) {
            // Print spaces for alignment
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            sp--;
            
            // Print elements of the row
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void isPascal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
    }
}
