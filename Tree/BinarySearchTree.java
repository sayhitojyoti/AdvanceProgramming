package com.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;
    private boolean flag;

    public boolean add(int key) { // AddKey
        flag = true;
        root = addNode(root, key);
        return flag;
    }

    private Node addNode(Node n, int key) {
        if (n == null) {
            n = new Node(key);
            return n;
        }
        if (key < n.key) {
            n.left = addNode(n.left, key);
        } else if (key > n.key) {
            n.right = addNode(n.right, key);
        } else {
            flag = false;
        }
        return n;
    }

    // Level-order traversal
    public void levelOrder() {
        Queue q = new LinkedList();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            Node n = (Node) q.poll();
            System.out.print(n.key + " ");
            if (n.left != null) q.add(n.left);
            if (n.right != null) q.add(n.right);
        }
        System.out.println();
    }

    // Pre-order traversal
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node n) {
        if (n == null) return;
        System.out.print(n.key + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    // In-order traversal
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node n) {
        if (n == null) return;
        inOrder(n.left);
        System.out.print(n.key + " ");
        inOrder(n.right);
    }

    // Post-order traversal
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node n) {
        if (n == null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.key + " ");
    }

    // Node class
    private class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }
}
