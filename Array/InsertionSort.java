package com.Array;
import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		int[]a= {2,5,8,1,9,6,4,3};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[]a)
	{
		for(int i=1;i<a.length;i++)
		{
		int key=a[i];
		int j=i-1;
		while(j>=0 && a[j]>key)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
		}
	}

}
