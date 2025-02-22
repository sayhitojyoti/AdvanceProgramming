package com.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(RomantoInt(20));
		

	}
	public static  String RomantoInt(int num)
	{
		Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		String s1="";
		m.put(1, "I");
		m.put(4, "IV");
		m.put(5, "V");
		m.put(9, "IX");
		m.put(10, "X");
		m.put(20, "XX");
		int []n= {20,10,9,5,4,1};
		for(int value:n)
		{
			if(num>=value)
			{
				s1+=m.get(value);
				num-=value;
			}
				
		}
		return s1;
		
		
		
		
	}

}
