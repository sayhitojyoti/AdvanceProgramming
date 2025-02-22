package com.Tree;

public class BST {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		// Adding nodes to the binary search tree
		bst.add(10);
		bst.add(5);
		bst.add(15);
		bst.add(3);
		bst.add(7);

		// Performing level-order traversal
		System.out.println("Level Order Traversal:");
		bst.levelOrder();
		System.out.println("Pre Order Traversal:");
		bst.preOrder();
		System.out.println("in Order Traversal:");
		bst.inOrder();
		System.out.println("post Order Traversal:");
		bst.postOrder();

	}

}
