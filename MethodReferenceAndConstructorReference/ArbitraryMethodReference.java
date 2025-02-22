package com.MethodReferenceAndConstructorReference;

import java.util.Arrays;
import java.util.List;

class Emp {
	String name;
	int age;
	int empid;

	public Emp(String name, int age, int empid) {
		this.name = name;
		this.age = age;
		this.empid = empid;
	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("empid:" + empid);
	}

}

public class ArbitraryMethodReference {

	public static void main(String[] args) {
		Emp[] e = { new Emp("Ram", 25, 1), new Emp("shyam", 28, 2) };
		List<Emp> l = Arrays.asList(e);
		l.stream().forEach(Emp::display);
	}

}
