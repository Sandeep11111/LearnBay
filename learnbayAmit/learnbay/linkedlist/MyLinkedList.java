/**
 * 
 */
package linkedlist;

/**
 * @author sandeepkumarsingh
 *
 */
public class MyLinkedList {

	Node head;

	public MyLinkedList() {
		this.head = null;
	}

	public void insertAtStart(int data) {
		Node temp = new Node(data);
		if (null == head) {
		    head = temp;
		} else {
			temp.next = head;
		    head = temp;
		}
	}
	
	public void deleteFromStart() {
		if(null == head) {
			System.out.println("List is empty");
			
		}else {
			 head = head.next;
		}
	}
	
	public void deleteFromLast() {
		Node current = head;
		while(current.next.next!=null) {
			 current = current.next;
		}
		 current.next = null;
	}
	
	public void deleteAfterData(int data) {
		Node current = head;
		while(current.data!=data) {
			 current = current.next;
		}
		 current.next = current.next.next;
	}
	
	public void insertAtLast(int data) {
		Node current = head;
		while(current.next!=null) {
			 current = current.next;
		}
		 current.next = new Node(data);
	}
	
	public void insertAfterData(int data1, int data2) {
		Node current = head;
		while(current.data!=data1) {
			 current = current.next;
		}
		Node node = new Node(data2);
		node.next = current.next;
		 current.next = node;
	}
	
	public void printlist() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data);
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
