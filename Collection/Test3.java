package com.Collection;

public class Test3 {

	public static void main(String[] args) {
		Test2<Integer> t1=new Test2<Integer>();
		t1.add(10);
		int i=t1.get();
		System.out.println(i);
		Test2<String> t2=new Test2<String>();
		t2.add("abc");
		t2.add("xyz");
		String s=t2.get();
		System.out.println(s);
		
		


	}

}
