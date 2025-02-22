package com.TwoDimensionalArray;

public class Circle implements Comparable {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Object arg) {
        Circle other = (Circle) arg; // Cast to Circle
        return this.radius - other.radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius;
    }

}
