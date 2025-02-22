package com.StringProgramming;

public class Reverse {

	public static void main(String[] args) {
		String S="java is very very easy";
		String temp="";
		String [] str=S.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			temp+=str[i];
			temp+=" ";
			
		}
		System.out.println(temp);
		

	}

}
