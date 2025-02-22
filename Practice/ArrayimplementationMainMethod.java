package com.Practice;

public class ArrayimplementationMainMethod {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation();
        
        // Test add(Object e)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Size: " + list.size()); // Output: 3
        
        // Test get
        System.out.println("Element at index 1: " + list.get(1)); // Output: Banana
        
        // Test remove
        list.remove(1);
        System.out.println("After removal, element at index 1: " + list.get(1)); // Output: Cherry
        System.out.println("Size after removal: " + list.size()); // Output: 2
        
        // Test add(int index, Object e)
        list.add(1, "Banana");
        System.out.println("After adding at index 1: " + list.get(1)); // Output: Banana
        System.out.println("Size after adding: " + list.size()); // Output: 3
    }
}
