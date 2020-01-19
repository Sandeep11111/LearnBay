/**
 * 
 */
package tree;

/**
 * @author sandeepkumarsingh
 * Driver class
 *  
                          10
                20                 30
           40        50        60       70
 */
public class TreeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
//		tree.root = new TreeNode(10);
//		
//		tree.root.left = new TreeNode(20);
//		tree.root.right = new TreeNode(30);
//		
//		tree.root.left.left = new TreeNode(40);
//		tree.root.left.right = new TreeNode(50);
//		
//		tree.root.right.left = new TreeNode(60);
//		tree.root.right.right = new TreeNode(70);
//		
		System.out.println("Tree Created");
		
		/* System.out.println("*******pre-order-reccursion------");
		tree.preOrder(tree.root);
		System.out.println("");
		
		System.out.println("*******pre-order-Iterative----");
		tree.preOrderIterative(tree.root);
		System.out.println(""); */
		
		/*System.out.println("*******post-order-reccursion-----");
		tree.postOrder(tree.root);
		System.out.println("");
		
		System.out.println("*******post-order-Iterative----");
		tree.postOrder(tree.root);
		System.out.println("");*/
		
		
		/*System.out.println("*******in-order---reccursion----");
		tree.inOrder(tree.root);
		System.out.println("");
		System.out.println("----in-order---Iterative----");
		tree.inOrderIterative(tree.root);*/
		
		/*System.out.println("*******level order traversal----");
		tree.levelOrderTraversal(tree.root);*/
		
		/*System.out.println("*******count node by reccursion----");
		System.out.println(tree.countNodeByReccursion(tree.root));*/
		
		/*System.out.println("*******count leaf node by reccursion----");
		System.out.println(tree.countLeafNodeByReccursion(tree.root));*/
		
//		System.out.println("*******BinarySearchTree----");
//		tree.insertBstWithIterative(10);
//		tree.insertBstWithIterative(8);
//		tree.insertBstWithIterative(5);
//		tree.insertBstWithIterative(12);
//		tree.insertBstWithIterative(15);
//		
//		tree.inOrder(tree.root);
		
//		tree.insertBstWithReccursive(10);
//		tree.insertBstWithReccursive(8);
//		tree.insertBstWithReccursive(5);
//		tree.insertBstWithReccursive(12);
//		tree.insertBstWithReccursive(15);
		
		tree.inOrder(tree.root);
		
		// Search
		
//		tree.insertBstWithIterative(10);
//		tree.insertBstWithIterative(8);
//		tree.insertBstWithIterative(5);
//		tree.insertBstWithIterative(12);
//		tree.insertBstWithIterative(15);
//		
//		tree.inOrder(tree.root);
		
		//tree.searchIterative(5);
		//tree.searchReccursive(5, tree.root);
		
		// Search
		
		// *******check for two trees are identical or mirror image
		
           Tree tree1 = new Tree();
		
           tree1.root = new TreeNode(10);
		
           tree1.root.left = new TreeNode(20);
           tree1.root.right = new TreeNode(30);
		
           tree1.root.left.left = new TreeNode(40);
           tree1.root.left.right = new TreeNode(50);
		
           tree1.root.right.left = new TreeNode(60);
           tree1.root.right.right = new TreeNode(70);
           
           Tree tree2 = new Tree();
   		
           tree2.root = new TreeNode(10);
		
           tree2.root.left = new TreeNode(20);
           tree2.root.right = new TreeNode(30);
		
           tree2.root.left.left = new TreeNode(40);
           tree2.root.left.right = new TreeNode(50);
		
           tree2.root.right.left = new TreeNode(60);
           tree2.root.right.right = new TreeNode(70);
		
           System.out.println(tree.isIdenticalOrMirrorImage(tree1.root, tree2.root));
           
		// ******* check for two trees are identical or mirror image
	}

}
