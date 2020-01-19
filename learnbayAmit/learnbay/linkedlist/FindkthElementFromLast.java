package linkedlist;

public class FindkthElementFromLast {

	public static void main(String[] args) {
		 LinkedListReturnsNode list = new LinkedListReturnsNode();
			
			list.insertAtStart(10);
			
			Node t2 = list.insertAtLast(20);
			Node t3 = list.insertAtLast(30);
			Node t4 = list.insertAtLast(40);
			Node t5 = list.insertAtLast(50);
	
			list.printlistWithSameLine();
			
			/*
			 * Method 1 (Use length of linked list)
               1) Calculate the length of Linked List. Let the length be len.
               2) Print the (len – n + 1)th node from the beginning of the Linked List.
			 */
			printNthFromLastApproach1(2,list.head); 
			
			/*
			 * Use two pointers
			 */
			printNthFromLastApproach2(2,list.head); 
	}

	private static void printNthFromLastApproach2(int n, Node head) {
		 Node main_ptr = head; 
	     Node ref_ptr = head; 
	  
	        int count = 0; 
	        if (head != null) { 
	            while (count < n) { 
	                if (ref_ptr == null) { 
	                    System.out.println(n + " is greater than the no "
	                                       + " of nodes in the list"); 
	                    return; 
	                } 
	                ref_ptr = ref_ptr.next; 
	                count++; 
	            } 
	            while (ref_ptr != null) { 
	                main_ptr = main_ptr.next; 
	                ref_ptr = ref_ptr.next; 
	            } 
	            System.out.println("Node no. " + n + " from last is " + main_ptr.data); 
	        } 
		
	}

	private static void printNthFromLastApproach1(int n, Node head) {
		{ 
	        int len = 0; 
	        Node current = head; 
	  
	        // 1) count the number of nodes in Linked List 
	        while (current != null) { 
	        	current = current.next; 
	            len++; 
	        } 
	  
	        // check if value of n is not more than length of 
	        // the linked list 
	        if (len < n) 
	            return; 
	  
	        current = head; 
	  
	        // 2) get the (len-n+1)th node from the beginning 
	        for (int i = 1; i < len - n + 1; i++) 
	        	current = current.next; 
	        System.out.println();
	        System.out.println("kth element---"+current.data); 
		
	}
	}
}
