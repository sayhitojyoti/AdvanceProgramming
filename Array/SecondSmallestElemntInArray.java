package com.Array;

public class SecondSmallestElemntInArray {

	public static void main(String[] args) 
	{
		int[] a= {5,8,7,9,2,7,3,5};
		int smallest=a[0];
		int secSmallest=a[0];
		for(int i=0;i<a.length;i++)
	{
			if(a[i]==smallest)continue;
			if(a[i]<smallest) 
			{
				secSmallest=smallest;
				smallest=a[i];
			}
		else if(a[i]<secSmallest||smallest==secSmallest)
		{
			secSmallest=a[i];
		}
		
	}
		System.out.println(secSmallest);	
}
}
