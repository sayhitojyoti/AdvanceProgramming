package com.Array;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int[]a= {7,8,6,3,2,8,1,5,4};
		System.out.println(search(a,9));
		System.out.println(search(a,1));
	}
	static int search(int[]a,int e)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==e)return i;
			
		}
		return -1;
	}

}
