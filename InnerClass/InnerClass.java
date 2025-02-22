package com.InnerClass;

class C {
	class D {
		void m1() {
			System.out.println("m1 in C.D");
		}

	}
}

public class InnerClass {

	public static void main(String[] args) {
		C c1 = new C();
		C.D d1 = c1.new D();
		d1.m1();

	}

}
