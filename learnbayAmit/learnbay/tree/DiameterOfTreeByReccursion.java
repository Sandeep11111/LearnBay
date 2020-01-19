package tree;

import java.util.ArrayList;
import java.util.List;

/*
 *                   10
                20        30
           40                  60
 *     50                  70
 * 
 */

//https://www.geeksforgeeks.org/diameter-of-a-binary-tree/

public class DiameterOfTreeByReccursion {
	
	public static void main(String[] args) {
	Tree tree = new Tree();
	
	tree.root = new TreeNode(10);
	
	tree.root.left = new TreeNode(20);
	tree.root.right = new TreeNode(30);
	
	tree.root.right.right = new TreeNode(60);
	
	tree.root.right.right = new TreeNode(70);
	
	tree.root.left.left = new TreeNode(40);
	
	tree.root.left.left.left = new TreeNode(50);
	
	System.out.println(diameterOfTreeByReccursion(tree.root));
	
	}

	private static int diameterOfTreeByReccursion(TreeNode root) {
		int leftHeight;
		int rightHeight;
		int rd;
		int ld;
		
		if (null == root) {
			return 0;
		}
		
			// considering root element
			leftHeight = heightOfTreeByReccursion(root.left);
			rightHeight = heightOfTreeByReccursion(root.right);
			
			// not considering root element
			ld = diameterOfTreeByReccursion(root.left);
			rd = diameterOfTreeByReccursion(root.right);
		
		/* Return max of following three 
        1) Diameter of left subtree 
       2) Diameter of right subtree 
       3) Height of left subtree + height of right subtree + 1 */
		return Math.max((leftHeight+rightHeight+1), Math.max(ld,rd));
	}

	private static int heightOfTreeByReccursion(TreeNode root) {
		if (null == root) {
			return 0;
		}
		/* If tree is not empty then height = 1 + max of left 
        height and right heights */
     return (1 + Math.max(heightOfTreeByReccursion(root.left), heightOfTreeByReccursion(root.right)));
	}
}
