package linkedlist;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		 LinkedListReturnsNode list1 = new LinkedListReturnsNode();
			
         list1.insertAtStart(10);
         list1.insertAtLast(40);
         list1.insertAtLast(60);
         Node node = list1.insertAtLast(80);

         LinkedListReturnsNode list2 = new LinkedListReturnsNode();

         list2.insertAtStart(20);
         list2.insertAtLast(50);
         list2.insertAtLast(70);
         Node node1 = list2.insertAtLast(100);

         list1.printlistWithSameLine();
         System.out.println();
         list2.printlistWithSameLine();
  
         Node newHead = mergeTwoSortedList(list1.head, list2.head);
         
         Node current = newHead;
 		while(current!=null) {
 			System.out.println("  "+current.data);
 			current = current.next;
 		}
         
	}

	private static Node mergeTwoSortedList(Node head1, Node head2) {
		
		 // if only one node in first list 
        // simply point its head to second list 
        if (head1.next == null) { 
            head1.next = head2; 
            return head1; 
        } 
        
     // Initialize current and next pointers of 
        // both lists 
        Node curr1 = head1, next1 = head1.next; 
        Node curr2 = head2, next2 = head2.next; 
        
        while (curr1 != null && curr2 != null) { 
            // if curr2 lies in between curr1 and next1 
            // then do curr1->curr2->next1 
            if ((curr2.data) >= (curr1.data) && (curr2.data) <= (next1.data)) { 
                next2 = curr2.next; 
                curr1.next = curr2; 
                curr2.next = next1; 
  
                // now let curr1 and curr2 to point 
                // to their immediate next pointers 
                curr1 = curr2; 
                curr2 = next2; 
            } 
            else { 
                // if more nodes in first list 
                if (next1.next != null) { 
                    next1 = next1.next; 
                    curr1 = curr1.next; 
                } 
  
                // else point the last node of first list 
                // to the remaining nodes of second list 
                else { 
                    next1.next = curr2; 
                    return head1; 
                } 
            } 
        } 
        
        
        
		return head2;
		
		
	}

}
