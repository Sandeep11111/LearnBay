/**
 * 
 */
package tree;

/**
 * @author sandeepkumarsingh
 * https://techiedelight.com/compiler/
 *
 */
public class LowestCommonAncestorProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		tree.root = new TreeNode(1);
		
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		
		tree.root.left.right = new TreeNode(4);
		
		tree.root.right.right = new TreeNode(6);
		
		tree.root.right.left = new TreeNode(5);
		
		tree.root.right.left.left = new TreeNode(7);
		
		tree.root.right.left.right = new TreeNode(8);
	
		  /* Construct below tree
        1
      /   \
     /     \
    2          3
     \     / \
      4   5   6
         / \
        7   8
  */


	System.out.println(findLCA(tree.root, tree.root.right.left.left, tree.root.right.right));
	System.out.println(findLCA(tree.root, tree.root.right.left.left, new TreeNode(10)));
	System.out.println(findLCA(tree.root, tree.root.right.left.left, tree.root.right.left.left));
	System.out.println(findLCA(tree.root, tree.root.right.left.left, tree.root.right.left));
	System.out.println(findLCA(tree.root, tree.root.left, tree.root.right.left));
	System.out.println(findLCA(tree.root, new TreeNode(50), new TreeNode(60)));

	}

	private static boolean  findLCA(TreeNode root, TreeNode x, TreeNode y) {
		// base case 1: return false if tree is empty
				if (root == null) {
					return false;
				}

				// base case 2: return true if either x or y is found
				if (root == x || root == y)
				{	
					return true;
				}
				
				// recursively check if x or y exists in the left subtree
				boolean left = findLCA(root.left, x, y);

				// recursively check if x or y exists in the right subtree
				boolean right = findLCA(root.right, x, y);
				
				
				//  if both x and y are present in the tree
				
//                   if (left && right) {
//                	   boolean left = findLCA(root.left, x, y);
//                	   boolean right = findLCA(root.right, x, y);
//                   }

				

				// return true if x or y is found in either left or right subtree
				return left || right;

}
}