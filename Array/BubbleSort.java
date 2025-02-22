package com.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {7, 8, 9, 6, 2, 8, 1};
        System.out.println("Before sorting: " + Arrays.toString(a));
        sort(a);
        System.out.println("After sorting: " + Arrays.toString(a));
    }

    public static void sort(int[] a) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length - 1; j++)
            {
                if (a[j] > a[j + 1]) 
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
