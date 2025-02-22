package com.Array;

import java.util.Arrays;

public class RotateAnArray {
  
	public static void main(String[] args) 
	{
	int[]a= {1,3,5,8,7,8,4,6};
         rotate(a);
      System.out.println(Arrays.toString(a));

	}
	static void rotate(int[]a) {
		int len=a.length;
		int temp=a[len-1];
		for(int i=len-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=temp;
	}

}
