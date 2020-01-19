package linkedlist;

public class AdditionLinkedList {

	public static Node addLinkList(Node head1, Node head2) {
		Node newList = new Node();
		Node temp = newList;
		int advance = 0;
		while (head1 != null && head2 != null) {
			int sum = head1.data + head2.data + advance;
			advance = sum / 10; // for carryover adding element
			sum = sum % 10;
			temp.next = new Node(sum);
			temp = temp.next;
			head1 = head1.next;
			head2 = head2.next;
		}
		return newList.next;
	}

	public static void main(String[] arg) {
		LinkedListReturnsNode list1 = new LinkedListReturnsNode();
		list1.insertAtStart(1);
		list1.insertAtLast(2);
		list1.insertAtLast(3);
	
		LinkedListReturnsNode list2 = new LinkedListReturnsNode();

		list2.insertAtStart(4);
		list2.insertAtLast(5);
		list2.insertAtLast(7);
		
		list1.printlistWithSameLine();
		System.out.println();
		list2.printlistWithSameLine();

		Node head = addLinkList(list1.head, list2.head);

		while (head != null) {
			System.out.println(" result ---> " + head.data);
			head = head.next;
		}
	}

}
