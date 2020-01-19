package linkedlist;

public class LinkedListReturnsNode {
	Node head;

	public LinkedListReturnsNode() {
		this.head = null;
	}

	public Node insertAtStart(int data) {
		Node temp = new Node(data);
		if (null == head) {
		    head = temp;
		} else {
			temp.next = head;
		    head = temp;
		}
		return head;
	}
	
	public Node deleteFromStart() {
		if(null == head) {
			System.out.println("List is empty");
			
		}else {
			 head = head.next;
		}
		return head;
	}
	
	public Node deleteFromLast() {
		Node current = head;
		while(current.next.next!=null) {
			 current = current.next;
		}
		 return current.next = null;
	}
	
	public Node deleteAfterData(int data) {
		Node current = head;
		while(current.data!=data) {
			 current = current.next;
		}
		 return current.next = current.next.next;
	}
	
	public Node insertAtLast(int data) {
		Node current = head;
		while(current.next!=null) {
			 current = current.next;
		}
		 return current.next = new Node(data);
	}
	
	public Node insertAfterData(int data1, int data2) {
		Node current = head;
		while(current.data!=data1) {
			 current = current.next;
		}
		Node node = new Node(data2);
		node.next = current.next;
		 return current.next = node;
	}
	
	public void printlist() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void printlistWithSameLine() {
		Node current = head;
		while(current!=null) {
			System.out.print("  "+current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList linkedList = new  MyLinkedList();
		linkedList.insertAtStart(10);
		linkedList.insertAtStart(20);
		linkedList.insertAtStart(30);
		linkedList.insertAtStart(40);
		System.out.println("*****insertAtLast********************");
		linkedList.insertAtLast(5);
		linkedList.printlist();
		System.out.println("*****insertAfterData********************");
		linkedList.insertAfterData(10, 15);
		linkedList.printlist();
		
		System.out.println("*****deleteFromStart********************");
		
		linkedList.deleteFromStart();
		linkedList.printlist();
		System.out.println("*****after  --deleteFromLast********************");
		linkedList.deleteFromLast();
		linkedList.printlist();
		System.out.println("*****after  --deleteFromLast********************");
		linkedList.deleteFromLast();
		linkedList.printlist();
	}
}
