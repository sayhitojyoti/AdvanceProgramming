package com.Practice;

public class Panagram {

	public static void main(String[] args) {
		System.out.println(isPanagram("a quick brown fox jumps over the lazy dog"));

	}
	public static boolean isPanagram(String s)
	{
		s=s.toLowerCase();
		if(s.length()<26)
			return false;
		
		for(char ch='a';ch<='z';ch++)
		{
			if(s.indexOf(ch)==-1)
			{
				return false;
			}
			
		}
		return true;
		
	}

}
