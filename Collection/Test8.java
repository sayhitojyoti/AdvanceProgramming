package com.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test8 {
	public static void main(String[] args) {
		Queue ob=new PriorityQueue();
		ob.add(40);
		ob.add(20);
		ob.add(30);
		ob.add(50);
		ob.add(10);
		ob.add(45);
		ob.add(4);
		
		while(!ob.isEmpty()) {
			System.out.println(ob.poll());
		}
	}
}
