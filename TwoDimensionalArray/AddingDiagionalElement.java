package com.TwoDimensionalArray;

import java.util.Arrays;

public class AddingDiagionalElement {

	public static void main(String[] args) {
		int[][] a= 
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
		    };
		int len=a.length;
//		System.out.println(Arrays.toString(a));
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum+=a[i][i];
			
		}
		System.out.println(sum);
	}

}
