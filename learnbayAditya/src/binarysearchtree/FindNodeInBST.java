package binarysearchtree;
//https://makeinjava.com/find-search-node-binary-search-tree-java-recursive-example/
public class FindNodeInBST {

	
	public static Node1 findNodeInBST(Node1 a, int value) {
		if(null == a) {
			return null;
		}
		//Condition 1. we found the value
		if(a.data == value) {
			return a;
		} 
		//Condition 2. 
		//Value is less than node value. so go left sub tree
		else if(value < a.data)
			return findNodeInBST(a.left,value);
		//Condition 3. 
		//Value is greater than node value. so go right sub tree
		else 
			return findNodeInBST(a.right,value);
	}
}
