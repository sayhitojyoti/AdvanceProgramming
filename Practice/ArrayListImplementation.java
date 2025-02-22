package com.Practice;

public class ArrayListImplementation {
    private Object[] a;
    private int pos;

    public ArrayListImplementation() {
        a = new Object[5];
        pos = 0;
    }

    public void add(Object e) {
        if (pos >= a.length) {
            increase();
        }
        a[pos++] = e;
    }

    private void increase() {
        Object[] temp = new Object[a.length + 3];
        System.arraycopy(a, 0, temp, 0, a.length);
        a = temp;
    }

    public int size() {
        return pos;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) { // Correct index validation
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        return a[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) { // Correct index validation
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        for (int i = index + 1; i < size(); i++) {
            a[i - 1] = a[i];
        }
        a[--pos] = null; // Avoid memory leak
    }

    public void add(int index, Object e) {
        if (index < 0 || index > size()) { // Allows index == size() for appending
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        if (pos >= a.length) {
            increase();
        }
        for (int i = size() - 1; i >= index; i--) {
            a[i + 1] = a[i];
        }
        a[index] = e;
        pos++;
    }
}
