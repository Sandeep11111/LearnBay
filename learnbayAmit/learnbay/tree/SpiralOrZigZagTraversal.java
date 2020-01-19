package tree;

import java.util.Stack;

public class SpiralOrZigZagTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        SpiralTreversal(tree.root);

	}
	
	public static void SpiralTreversal(TreeNode root){
		Stack<TreeNode> s1= new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty()){
			while(!s1.isEmpty()){
				TreeNode node = s1.pop();
				System.out.println(node.data);
				if(null!=node.left){
					s2.push(node.left);
				}if(null!=node.right){
					s2.push(node.right);
				}
			}
			while(!s2.isEmpty()){
				TreeNode node = s2.pop();
				System.out.println(node.data);
				if(null!=node.right){
					s1.push(node.right);
				}if(null!=node.left){
					s1.push(node.left);
				}
			}
		}
	}

}
