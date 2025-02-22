package com.Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample { // Renamed to follow naming conventions
    public static void main(String[] args) {
        // Use generics to specify the type of elements
        Queue q = new PriorityQueue();
        Queue q1 = new LinkedList();
        Queue q2 =new ArrayDeque();
        
        q.add(10);
        q.add(25);
        q.add(20);
        q.add(55);
        q1.add(10);
        q1.add(25);
        q1.add(20);
        q1.add(55);

        q2.add(10);
        q2.add(25);
        q2.add(20);
        q2.add(55);


        // Poll elements from the queue
        System.out.println("Elements in PriorityQueue (natural order):");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
        System.out.println("Elements in LinkedList :");
        while (!q1.isEmpty()) {
            System.out.println(q1.poll());
        }
        System.out.println("Elements in ArrayDeque :");
        while (!q2.isEmpty()) {
            System.out.println(q2.poll());
        }
    }
}
