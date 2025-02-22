package com.StringProgramming;

public class Panagram {

	public static void main(String[] args) {
      System.out.println(isPanagram("a quick brown fox jumps over the lazy dog"));
	}
	public static boolean isPanagram(String S) {
		S=S.toLowerCase();
		if(S.length()<26)
		{
			return false;
		}
		for(char ch='a';ch<='z';ch++)
		{
			if(S.indexOf(ch)==-1)
				return false;
		}
		return true;
		
	}

}
