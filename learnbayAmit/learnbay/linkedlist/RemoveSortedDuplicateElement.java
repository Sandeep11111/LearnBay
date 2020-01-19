package linkedlist;

public class RemoveSortedDuplicateElement {

	public static void main(String[] args) {
		 LinkedListReturnsNode list = new LinkedListReturnsNode();
			
			list.insertAtStart(10);
			
			list.insertAtLast(20);
			list.insertAtLast(30);
			list.insertAtLast(30);
			list.insertAtLast(30);
	
			list.printlistWithSameLine();
			
			Node node = removeDuplicatesSimpleApproach(list.head);
			System.err.println(node.data);
			 while(node!=null) {
		 			System.out.println("  "+node.data);
		 			node = node.next;
		 		}
			 //removeDuplicates(list.head);
		

	}
	
	private static Node removeDuplicatesSimpleApproach(Node head) {
		 Node current = head;
		    while(current.next!=null){
		        if(current.data!=current.next.data){
		        	current.next=current.next;
		        }else{
		        	current.next=current.next.next;
		        }
		    }
		    return current;
		
	}

	private static void removeDuplicates(Node head) {
    { 
        /*Another reference to head*/
        Node curr = head; 
  
        /* Traverse list till the last node */
        while (curr != null) { 
             Node temp = curr; 
            /*Compare current node with the next node and  
            keep on deleting them until it matches the current  
            node data */
            while(temp!=null && temp.data==curr.data) { 
                temp = temp.next; 
            } 
            /*Set current node next to the next different  
            element denoted by temp*/
            curr.next = temp; 
            curr = curr.next; 
        } 
        while(curr!=null) {
 			System.out.println("  "+curr.data);
 			curr = curr.next;
 		}
    } 
   
	}
}
