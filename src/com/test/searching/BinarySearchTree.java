package com.test.searching;

public class BinarySearchTree {
	public Node<Integer> root;

	public BinarySearchTree insert(int value) {

		Node<Integer> node = new Node<Integer>(value);

		if (root == null) {
			root = node;
			return this;
		}

		insertRecord(root, node);
		
		return this;
	}

	private void insertRecord(Node<Integer> head, Node<Integer> node) {

		if (head.value > node.value) {
			if (head.left == null) {
				head.left = node;
				return;
			}
			insertRecord(head.left, node);
		} else {
			if (head.right == null) {
				head.right = node;
				return;
			}
			insertRecord(head.right, node);
		}
	}

	public int findMinimum() {
		if (root == null) {
			return 0;
		}

		Node currentNode = root;
		while (currentNode.left != null) {
			currentNode = currentNode.left;
		}

		return currentNode.value;

	}

	public int findMaximum() {
		if (root == null) {
			return 0;
		}

		Node currentNode = root;
		while (currentNode.right != null) {
			currentNode = currentNode.right;
		}

		return currentNode.value;
	}

	// Print InOrder Traversal
	public void printInOrder() {
		printInOrderRecord(root);
		System.out.println("");
	}

	private void printInOrderRecord(Node currentNode) {
		if (currentNode == null) {
			return;
		}

		printInOrderRecord(currentNode.left);
		System.out.print(currentNode.value + ", ");
		printInOrderRecord(currentNode.right);
	}

	// Print InOrder Traversal
	public void printPreOrder() {
		printPreOrderRecord(root);
		System.out.println("");
	}

	private void printPreOrderRecord(Node currentNode) {
		if (currentNode == null) {
			return;
		}

		System.out.print(currentNode.value + ",");
		printInOrderRecord(currentNode.left);
		printInOrderRecord(currentNode.right);
	}
	
	// Print InOrder Traversal
	public void printPostOrder() {
		printPostOrderRecord(root);
		System.out.println("");
	}

	private void printPostOrderRecord(Node currentNode) {
		if (currentNode == null) {
			return;
		}

		printInOrderRecord(currentNode.left);
		printInOrderRecord(currentNode.right);
		System.out.print(currentNode.value + ",");
	}
	
	

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(40).insert(25).insert(78).insert(10).insert(3).insert(17)
				.insert(32).insert(30).insert(38).insert(78).insert(50)
				.insert(93);
		System.out.println("Inorder traversal");
		bst.printInOrder();

		System.out.println("Preorder Traversal");
		bst.printPreOrder();

		System.out.println("Postorder Traversal");
		bst.printPostOrder();

		System.out.println("The minimum value in the BST: " + bst.findMinimum());
		System.out.println("The maximum value in the BST: " + bst.findMaximum());

	}
}

class Node<T> {
	public int value;
	public Node right;
	public Node left;

	public Node(int value) {
		this.value = value;
	}
}
