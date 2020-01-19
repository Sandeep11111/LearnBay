package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalOrderTraversal {

	
	public static HashMap<Integer, List<Integer>> map = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree = new Tree();
		/*tree.root = new TreeNode(1);
		tree.root.rightChild = new TreeNode(2);
		tree.root.leftChild = new TreeNode(3);
		tree.root.rightChild.rightChild = new TreeNode(5);
		tree.root.leftChild.leftChild = new TreeNode(6);*/
		tree.root = new TreeNode(1);
		tree.root.right= new TreeNode(3);
		tree.root.left = new TreeNode(2);
		tree.root.left.right = new TreeNode(4);
		tree.root.left.right.right = new TreeNode(5);
		tree.root.left.right.right.right = new TreeNode(6);
		
		
		verticalOrderTraversal(tree.root);
		for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
			System.out.println("Distance : "+entry.getKey()+"  Values : "+entry.getValue() );
		}

	}

	public static void verticalOrderTraversal(TreeNode root) {
		if (null == map) {
			map = new HashMap<>();
		}
		verticalTrav(root, 0);

	}
	private static void verticalTrav(TreeNode root, int distance) {
		if (null == root) {
			return;
		}
		List<Integer> list = null;
		if (map.containsKey(distance)) {
			list = map.get(distance);
		} else {
			list = new ArrayList<>();
		}
		list.add(root.data);
		map.put(distance, list);
		verticalTrav(root.left, distance - 1);
		verticalTrav(root.right, distance + 1);

	}

}
