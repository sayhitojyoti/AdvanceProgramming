package com.TwoDimensionalArray;

public class MatrixMultiplication {

	private static final String Static = null;

	public static void main(String[] args)
	{
		int[][] a= 
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
		    };
		int[][] b= 
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		    };
		int [][]c=multiply(a,b);
		for(int[]temp:c)
		{
			for(int n:temp)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
		public static int[][] multiply(int[][] a,int[][]b)
		{
			int len=a.length;
			int [][]c=new int[len][len];
			for(int i=0;i<len;i++)
			{
				for(int j=0;j<len;j++)
				{
					for(int k=0;k<len;k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
						
					}
				}
			}
			return c;
		}
}
		
