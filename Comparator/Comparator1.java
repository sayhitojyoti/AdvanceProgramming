package com.Comparator;

import java.util.Comparator;

public class Comparator1 implements Comparator<Test> {
    // Comparator to compare Test objects based on the 'length' property
    @Override
    public int compare(Test t1, Test t2) {
        return t1.getLength() - t2.getLength();
    }
}

// Test class in a separate file or outside Comparator1
class Test {
    private String name;
    private int length;

    // Constructor
    public Test(String name, int length) {
        this.name = name;
        this.length = length;
    }

    // Getter for 'length'
    public int getLength() {
        return length;
    }

    // Override toString for meaningful printing
    @Override
    public String toString() {
        return name + " (" + length + ")";
    }
}
