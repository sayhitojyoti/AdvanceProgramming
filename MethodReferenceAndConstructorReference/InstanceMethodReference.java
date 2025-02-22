package com.MethodReferenceAndConstructorReference;

import java.util.function.Consumer;

public class InstanceMethodReference {
	public void PrintMsg(String s) {
		System.out.println("message: " + s);
	}

	public static void main(String[] args) {
		Consumer<String> cs = c -> System.out.println("message: " + c);
		InstanceMethodReference m = new InstanceMethodReference();
		Consumer<String> c = m::PrintMsg;
		cs.accept("python");
		c.accept("java");
	}
}
