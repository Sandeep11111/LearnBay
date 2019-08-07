package binarysearchtree;

public class Node1 {
	public int data;
	public Node1 left;
	public Node1 right;

	public Node1(int num) {
		this.data = num;
		this.left = null;
		this.right = null;
	}

	public Node1() {
		this.left = null;
		this.right = null;
	}

	public static Node1 createNode(int number) {
		return new Node1(number);
	}
}
