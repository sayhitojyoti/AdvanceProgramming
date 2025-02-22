package com.InnerClass;
class E
{
	int i;
	E(int i)
	{
		this.i=i;
	}
	class F
	{
		void m1()
		{
			System.out.println(i);
		}
	}
}

public class Test1 {

	public static void main(String[] args) {
		E e1=new E(10);
		E e2=new E(20);
		E.F f1=e1.new F();
		f1.m1();
		E.F f2=e2.new F();
		f2.m1();
		
		
		

	}

}
