package tree;

import java.util.ArrayList;
import java.util.List;

/*
 *                   10
                20        30
           40              
 *     50
 * 
 */
public class HeightOfTreeByReccursion {
	
	public static void main(String[] args) {
	Tree tree = new Tree();
	
	tree.root = new TreeNode(10);
	
	tree.root.left = new TreeNode(20);
	tree.root.right = new TreeNode(30);
	
	tree.root.left.left = new TreeNode(40);
	
	tree.root.left.left.left = new TreeNode(50);
	
	System.out.println(heightOfTreeByReccursion(tree.root));
	
	}

	private static int heightOfTreeByReccursion(TreeNode root) {
		int leftHeight;
		int rightHeight;
		
		if (null == root) {
			return 0;
		}
		else {
			leftHeight = 1+heightOfTreeByReccursion(root.left);
			rightHeight = 1+heightOfTreeByReccursion(root.right);
		}
		if(leftHeight>rightHeight) {
			return leftHeight;
		}
		return rightHeight;
	}
}
