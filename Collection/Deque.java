package com.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Deque {

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add(50);
		s.add(40);
		s.add(30);
		s.add(10);
		s.add(20);
		s.add(60);
		System.out.println("first:"+s.first());
		System.out.println("last:"+s.last());
		System.out.println("HEADSET");
		SortedSet s1 = s.headSet(40);
		display(s1);
		System.out.println("TAILSET");
		SortedSet s2 = s.tailSet(40);
		display(s2);
		System.out.println("SUBSET");
		SortedSet s3 = s.subSet(20, 50);
		display(s3);

	}

	private static void display(SortedSet s) {
		for (Object o : s) {
			System.out.println(o + "");
		}
		System.out.println();

	}

}
