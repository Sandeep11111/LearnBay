/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author sandeepkumarsingh
 * definition:- binary tree has either 0 1 2 children
 * 
 *                       10
                 20                30
           40        50        60       70
 */
public class Tree {

	public TreeNode root;
	
	Tree(){
		this.root = null;
	}
	
	public void preOrder(TreeNode root) {
		if(null!= root) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void preOrderIterative(TreeNode root) {
		TreeNode current = root;
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(current);
		while(!st.empty()) {
			TreeNode tmp = (TreeNode) st.pop();
			if(null!= tmp) {
				result.add(tmp.data);
				if(null!= tmp.right) {
					st.push(tmp.right);	
				}
				if(null!= tmp.left) {
					st.push(tmp.left);	
				}
			}
			
		}
		System.out.println(result.toString());
	}
	
	public void inOrder(TreeNode root) {
		if(null!= root) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public void inOrderIterative(TreeNode root) {
		TreeNode current = root;
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		boolean done = false;
		while(!done) {
			if(null!=current) {
				st.push(current);
				current = current.left;
			} else {
				if(st.empty()) {
					done = true;
				}else {
					current = st.pop();
					result.add(current.data);
					current = current.right;
				}
			}
		}
		System.out.println(result.toString());
	}
	
	public void postOrder(TreeNode root) {
		if(null!= root) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	public void levelOrderTraversal(TreeNode root) {
		int count = 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			count++;
			result.add(tmp.data);
			if(null!=tmp.left) {
				queue.add(tmp.left);
			}
			if(null!=tmp.right) {
				queue.add(tmp.right);
			}
		}
		System.out.println(result.toString());
		System.out.println("number of nodes ----"+count);
	}
	
	public int countNodeByReccursion(TreeNode root) {
		if(root == null) {
			return 0;
			
		}else {
			int count = 1;
			count = count+countNodeByReccursion(root.left);
			count = count+countNodeByReccursion(root.right);
			return count;
		}
	}
	
	public int countLeafNodeByReccursion(TreeNode root) {
		if(root == null) {
			return 0;
			
		}if(root.left == null && root.right == null) {
			return 1;
		}else {
			return countLeafNodeByReccursion(root.left)+countLeafNodeByReccursion(root.right);
		}
	}
	
	// Binary Search Tree - it keeps the property of binary tree and its maintain the order left side of 
	//                       tree is less than root and right side is greater
	
	public void insertBstWithIterative(int data) {
		TreeNode current = root;
		TreeNode parent = null;
		if(current == null) { // root node null
			root = new TreeNode(data);
		}else if(data < current.data) { // left side iteration
			while(current!=null) {
				parent = current;
				current = current.left;
			}
			parent.left = new TreeNode(data);
		}else {  // right side iteration
			while(current!=null) {
				parent = current;
				current = current.right;
			}
			parent.right = new TreeNode(data);
		}
	}
	
	public void insertBstWithReccursive(int data) {
		TreeNode node = insertReccursive(root, data);
		System.out.println(node.data);
	}
	
	public TreeNode insertReccursive(TreeNode root, int data) {
		if(root == null) {
		   root = new TreeNode(data);
		   return root;
		}else if(data<root.data) {
			root.left = insertReccursive(root.left, data);
		}
		return root;
	}
	
	public TreeNode searchIterative(int data) {
		TreeNode current = root;
		while(current!=null && current.data!=data) {
			if(data<current.data) {
				current = current.left;
			}else {
				current = current.right;
			}
		}if(null!=current) {
			System.out.println("Data Found");
			return current;
		}
		    System.out.println("Data is not there");
		return null;
	}
	
	public void searchReccursive(int data, TreeNode root) {
		if(root == null) {
			System.out.println("Data not found");
		}
		if(root.data == data) {
			System.out.println("Data found");
		}
		else if(data<root.data) {
			searchReccursive(data, root.left);
		}else {
			searchReccursive(data, root.right);
		}
	}
	
	public boolean isIdenticalOrMirrorImage(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null) {
				return true;
			}else if(root1 == null && root2 != null || root1 != null && root2 == null) {
				return false;
			}else {
				return (root1.data == root2.data)
						&& isIdenticalOrMirrorImage(root1.left, root2.left)
						&& isIdenticalOrMirrorImage(root1.right, root2.right);
			}
	}
}
