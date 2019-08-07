package binarysearchtree;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node1 A = Node1.createNode(50);
		// Level 1
		Node1 B = Node1.createNode(40);
		Node1 C = Node1.createNode(60);
		// Level 2
		Node1 D = Node1.createNode(30);
		Node1 E = Node1.createNode(45);
		Node1 F = Node1.createNode(55);
		Node1 G = Node1.createNode(70);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
				
		Node1 node = FindNodeInBST.findNodeInBST(A, 180);
		if (null == node) {
			System.out.printf("Node=%d does not exists in BST\n",180);
		} else {
			System.out.printf("Found node=%d in BST\n",180);
		}
		
		node = FindNodeInBST.findNodeInBST(A, 45);
		if (null == node) {
			System.out.printf("Node=%d does not exists in BST\n",45);
		} else {
			System.out.printf("Found node=%d in BST\n",45);
		}
	}
}
