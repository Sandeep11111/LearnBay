package linkedlist;

public class LengthOfLoop {

public static void main(String args[]) {
		
		LinkedListReturnsNode list = new LinkedListReturnsNode();
		
		list.insertAtStart(10);
		
		Node t2 = list.insertAtLast(20);
		Node t3 = list.insertAtLast(30);
		Node t4 = list.insertAtLast(40);
		Node t5 = list.insertAtLast(50);
		
		t5.next = t3;// 30 pointing to 50
		//list.printlistWithSameLine(); it print infinite loop
		detectLoopAndFindStartNodeOfLoopAndRemoveLoop(list);
	}

	private static void detectLoopAndFindStartNodeOfLoopAndRemoveLoop(LinkedListReturnsNode list) {
	
	    boolean loop = false;
	    Node slow = list.head;
	    Node fast = list.head;
	    while(slow!=null && fast!=null && fast.next!=null) {
	    	slow = slow.next;
	    	fast = fast.next.next;
	    	if(slow == fast) {
	    		loop = true;
	    		System.out.println("Loop exist");
	    		break;
	    	}
	    }
	    
	    // length of loop
	    
	    int length =0;
	    slow = slow.next;
	    length++;
	    while(slow!=fast) {
	    	length++;
	    	slow = slow.next;
	    }
	    
	    System.out.println("Length of loop--"+length);
	    
	   if(loop) {
		   slow = list.head; //reseting slow pointer to head and fast pointer will be there at loop starting point
	       Node prev = null; //keep previous pointer track for fast pointer inorder to remove loop
	       while(slow!=fast) {
	    	   slow = slow.next;
	    	   prev = fast;
	    	   fast = fast.next;
	       }
	       //list.printlist();this will print inf
	       System.out.println("Loop starting point is"+fast.data);
	       prev.next = null;
	       System.out.println("Printing list after loop removal");
	       list.printlist();
	   }
	}
	
}
