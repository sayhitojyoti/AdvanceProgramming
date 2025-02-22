package com.StringProgramming;

public class NumberofChar {

	public static void main(String[] args) {
		String s1="aaaabbbbccdddd";
		char[]a=s1.toCharArray();
		String s2="";
		int i=0;
		char c;
		int count;
		while(i<a.length)
		{
			c=a[i];
			count=1;
			i++;
			while(i<a.length&&a[i]==c)
			{
				count++;
				i++;
			}
			s2=s2+count+c;
		}
          System.out.println(s2);
	}

}
