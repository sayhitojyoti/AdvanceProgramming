package com.InnerClass;

class A {
	static class B {
		void m1()

		{
			System.out.println("m1 in A.B");
		}
	}
}

public class NestedClass {

	public static void main(String[] args) {
		A.B b1 = new A.B();
		b1.m1();

	}

}
