package com.Collection;

import java.util.ArrayList;
import java.util.Collections; // Import the Collections class for sorting
import java.util.Comparator;
import java.util.List;

public class CollectionsExample { // Renamed to avoid conflict with java.util.Collections
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Use generics to specify the type of elements
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(200);
		l.add(90);

		System.out.println("Before sorting: " + l);

		// Use java.util.Collections.sort() to sort the list
		Collections.sort(l);

		System.out.println("After sorting: " + l);
		System.out.println("Before sorting: " + l);

		// Use java.util.Collections.sort() to sort the list
		Collections.sort(l, new DescCompare());

		System.out.println("After sorting: " + l);
	}
	public static class DescCompare implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Integer i1=(Integer)o1;
			Integer i2=(Integer)o2;
			return i2-i1;
		}
	}
}


	
	

