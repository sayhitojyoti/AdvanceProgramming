package com.Collection;

import java.util.Collection;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		Collection<String> s1=new LinkedList<String>();
		Collection<String> s2=new LinkedList<String>();
		s1.add("raj");
		s1.add("Deep");
		System.out.println(s1.add("abc"));
		System.out.println(s1.size());
		s2.add("15");
		s2.add("22");
		s1.addAll(s2);
		System.out.println(s1.size());
		System.out.println(s1.containsAll(s2)); 
		s1.removeAll(s2);
		System.out.println(s1.size());
		

	}

}
