package com.Array;

public class BinarySearch {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		System.out.println(search(a,6));
		System.out.println(search(a,1));
	}
	static int search(int[]a,int e)
	{
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(e==a[mid]) return mid;
			else if(e<a[mid])end=mid-1;
			else start=mid+1;
			
		}
		return -1;
	}

}
