package com.TwoDimensionalArray;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Circle[] a = 
			{
				new Circle(50),
				new Circle(40),
				new Circle(30),
				new Circle(10)
		    };
		Arrays.sort(a);
		for (Circle c : a) {
			System.out.println(c);
			
		}

	}

}
