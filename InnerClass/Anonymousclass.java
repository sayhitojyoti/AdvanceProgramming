package com.InnerClass;

interface I {
	void m1();
}

public class Anonymousclass {

	public static void main(String[] args) {
		I ref = new I() {
			public void m1() {
				System.out.println("M1");
				
			}

		};
		ref.m1();

	}

}
