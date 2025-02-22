package com.Array;

public class SmallestElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {9,2,5,8,9};
		int smallest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
				
			}
		}
		System.out.println(smallest);

	}

}
