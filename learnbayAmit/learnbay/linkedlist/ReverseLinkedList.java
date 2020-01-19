/**
 * 
 */
package linkedlist;

/**
 * @author sandeepkumarsingh
 *
 */
public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
         LinkedListReturnsNode list = new LinkedListReturnsNode();
		
		list.insertAtStart(10);
		
		Node t2 = list.insertAtLast(20);
		Node t3 = list.insertAtLast(30);
		Node t4 = list.insertAtLast(40);
		Node t5 = list.insertAtLast(50);
		
		
		list.head = reverseList(list.head);
		list.printlist();

	}
	
	public static Node reverseList(Node head) {
		Node current = head;
		Node prev = null;
		
		while(current!=null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

}
