package com.Practice;

import java.util.regex.Pattern;

public class validatePassword {

	public static void main(String[] args) {
		System.out.println(isPassword("abZ@78Ahoj0"));
		

	}
	static boolean isPassword(String pwd)
	{
		String exp="(?=.*[!#$%@%])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]){8,15}";
		Pattern p=Pattern.compile(exp);
		return p.matcher(pwd).matches();
		
	}

}
