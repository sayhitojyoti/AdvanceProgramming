package com.StringProgramming;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("racee","care"));

	}
	public static boolean isAnagram(String s1,String s2) {
		while(true) {
	    if(s1.length()!=s2.length())
	    {
	    	return false;
	    }
	    if(s1.length()==0&&s2.length()==0)
	    {
	    	return true;
	    }
	    char ch=s1.charAt(0);
	    s1=s1.replace(ch+"", "");
	    s2=s2.replace(ch+"", "");
		}
	}

}
