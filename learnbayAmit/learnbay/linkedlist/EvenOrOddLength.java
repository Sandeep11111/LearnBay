/**
 * 
 */
package linkedlist;

/**
 * @author sandeepkumarsingh
 *
 */
public class EvenOrOddLength {

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
		
		
		String value = checkForEvenOrOdd(list.head);
		System.out.println(value);
	}

	private static String checkForEvenOrOdd(Node head) {
		 Node fast = head;
		 while(fast.next!=null && fast.next.next!=null) {
			fast = fast.next.next;
		 }
		 if(fast.next == null) {
			 return "odd";
		 }else {
			 return "even";
		 }
	}

}
