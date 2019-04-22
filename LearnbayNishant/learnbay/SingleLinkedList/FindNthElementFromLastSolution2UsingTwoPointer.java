package SingleLinkedList;

/*
 * For finding N'th node from the end of a Linked List, below steps need to be performed.

STEP 1:  Take 2 pointers, say ptrA and ptrB. initialize both pointers pointing at start node.

STEP 2:  Move ptrB to Nth node from start keeping ptrA at start node. 

STEP 3:  If Nth position is not available that is, if ptrB encounters NULL before reaching Nth
                 position, then given Nth position is not available and is incorrect, so return -1.
                 
                 If Nth position is valid input, then place ptr2 at Nth position.

STEP 4:   Now, when both pointers are at N distance from each other, increment ptrA and ptrB one 
                  node at a time until ptrB encounters NULL.

STEP 5:   When ptrB reaches NULL, it means ptrA reached Nth position from last. So return node 
                  at position ptrA.

 */

import SingleLinkedList.FindNthElementFromLastSolution1UsingTwoPointer.Node;

public class FindNthElementFromLastSolution2UsingTwoPointer {

	Node startNode;
	
	public static void main(String[] args) {
		 new FindNthElementFromLastSolution2UsingTwoPointer();
		
		//http://javabypatel.blogspot.com/2015/12/find-nth-node-from-last-in-linked-list.html

	}
	
	 public FindNthElementFromLastSolution2UsingTwoPointer() {
	        addNode(new Node(10));
	        addNode(new Node(20));
	        addNode(new Node(30));
	        addNode(new Node(40));
	        addNode(new Node(50));
	        addNode(new Node(60));
	        addNode(new Node(70));
	 
	        //Print original list.
	        printLinkList();
	         
	        //Print Nth last node.
	        System.out.println(getNthLastNodeFromLinkList(6));  
	    }
	 
	 // Solution 1
	    private int getNthLastNodeFromLinkList(int nodeFromLast) {
	        if(nodeFromLast<=0 || startNode==null){
	            return -1;
	        }
	 
	        Node ptrA=startNode, ptrB = startNode;
	 
	        //Moving ptrB N nodes from start keeping ptrA at head node.
	        for (int i=0; i < nodeFromLast; i++) {
	             
	            //If ptrB reaches NULL, then return -1 as indication that given Nth value is incorrect and list doesn't contain N elements.
	            if(ptrB==null){
	                return -1;
	            }
	            ptrB = ptrB.getNext();
	        }
	         
	        //Now incrementing ptrA and ptrB one node at a time until ptrB encounters NULL, 
	        //when it encounters NULL then ptrA will be at Nth position from end of list. 
	        while(ptrB!=null){
	            ptrB = ptrB.getNext();
	            ptrA = ptrA.getNext();
	        }
	         
	        return ptrA.getData();      
	    }
	     
	    private void printLinkList() {
	        Node tempNode = startNode;
	        while(tempNode!=null){
	            System.out.print(tempNode.getData() + " ");
	            tempNode = tempNode.getNext();
	        }
	        System.out.println("\n============================================");
	    }
	 
	    private void addNode(Node node) {
	        if(startNode!=null){
	            Node tempNode = startNode;
	            while(tempNode.getNext()!=null){
	                tempNode = tempNode.getNext();
	            }
	            tempNode.setNext(node);
	        }else{
	            this.startNode = node;
	        }
	    }
	    
	    /* Linked List node */
	    class Node 
	    { 
	    	private int data;
	    	 private Node next;
	    	  
	    	 public Node(int data) {
	    	  this.data = data;
	    	 }
	    	 public int getData() {
	    	  return data;
	    	 }
	    	 public void setData(int data) {
	    	  this.data = data;
	    	 }
	    	 public Node getNext() {
	    	  return next;
	    	 }
	    	 public void setNext(Node next) {
	    	  this.next = next;
	    	 }
	    } 
}
