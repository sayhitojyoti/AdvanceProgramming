package com.ConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

public class Emp {
	String Name;
	int Age;
	int Empid;

	Emp() {
		System.out.println("Emp()cons");
	}

	Emp(String Name) {
		this.Name = Name;
	}

	Emp(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;

	}

	public Emp(String Name, int Age, int Empid) {
		this.Name = Name;
		this.Age = Age;
		this.Empid = Empid;
	}

	public void display() {
		System.out.println("Name:" + Name);
		System.out.println("Age:" + Age);
		System.out.println("Empid:" + Empid);

	}

	@FunctionalInterface
	interface I1<Y> {
		Y m1(String s, int a, int e);
	}

	public class EmpDriver {
		public static void main(String[] args) {
			Supplier<Emp> sp = () -> new Emp();
			Emp e1 = sp.get();
			e1.display();
			System.out.println("================");
			Supplier<Emp> s = Emp::new;
			Emp e2 = s.get();
			e2.display();
			System.out.println("================");
			Function<String,Emp> fn = st -> new Emp(st);
			Emp e3 = fn.apply("Ram");
			e3.display();
			System.out.println("================");
			Function<String, Emp> f = Emp::new;
			Emp e4 = f.apply("Sita");
			e4.display();
			System.out.println("================");
			I1<Emp> i1 = Emp::new;
			Emp e5 = i1.m1("Pushpa", 40, 1);
			e5.display();

		}

	}
}
