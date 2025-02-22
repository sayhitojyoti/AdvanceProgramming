package com.MethodReferenceAndConstructorReference;

import java.util.function.Function;

public class StaticMethodReference {

	public static void main(String[] args) {
		Function<String, Integer> fn = s -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt;
		System.out.println(fn.apply("12134"));
		System.out.println(f.apply("15454"));

	}

}
