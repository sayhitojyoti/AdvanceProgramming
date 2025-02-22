package com.StringProgramming;

public class CharOccuranceWithoutMethod {

	public static void main(String[] args) {
		String s="apple";
		printCharOcc(s);
	}
	public static void printCharOcc(String s) {
		char[] c =s.toCharArray();
		String check="";
		for(int i=0; i<c.length; i++) {
			char currentchar = c[i];
			boolean counted = false;
			for(int k=0;k<check.length(); k++) {
				if(check.charAt(k) == currentchar) {
					counted = true;
					break;
				}
			}
			if(!counted) {
				int count = 0;
				for(int j=0; j<c.length;j++) {
					if(c[j] == currentchar) count++;
			}
			System.out.println(currentchar + "=" + count);
			check += currentchar;
		}
	}
}
}