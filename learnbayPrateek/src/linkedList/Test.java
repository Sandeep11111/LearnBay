package linkedList;

import java.util.Scanner;

//https://www.youtube.com/watch?v=fD3FnEBX-N0&list=PL7ersPsTyYt2gskM6IKhsHaI5EtJlkNog&index=3
class Node{
	private int data;
	private Node next;

	public Node() {
		data=0;
		next=null;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
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

class LinkedList {
	private int size;
	private Node start;

	public LinkedList() {
		size = 0;
		start = null;;
	}
	public LinkedList(int size, Node start) {
		super();
		this.size = size;
		this.start = start;
	}

	public boolean isEmpty() {
		if(start == null) {
			return (true);
		}
		return (false);
	}

	public int getListSize() {
		return (size);
	}

	public void insertAtFirst(int val) {
		Node n;
		n = new Node();
		n.setData(val);
		n.setNext(start);
		size++;
	}

	public void insertAtLast(int val) {
		Node n,t;
		n = new Node();
		n.setData(val);
		t=start;
		if(t == null) {
			start=n;
		}else {
			while(t.getNext()!=null) {
				t=t.getNext();t.setNext(n);

			}
			size++;
		}
	}

	public void insertAtPos(int val, int pos) {
		if(pos==1) {
			insertAtFirst(val);
		}
		else if(pos == size+1) {
			insertAtLast(val);
		}
		else if(pos>1 && pos<=size) {
			Node n,t;
			n= new Node(val,null);
			t=start;
			for(int i=1;i<pos-1;i++) {
				t=t.getNext();
				n.setNext(t.getNext());
				t.setNext(n);
				size++;
			}

		}
		else
			System.out.println("insertion not possible at this position"+pos);
	}

	public void deleteFirst() {
		if(start==null) {
			System.out.println("List is already empty");
		}
		else {
			start=start.getNext();
			size--;
		}
	}

	public void deleteLast() {
		if(start==null) {
			System.out.println("List is already empty");
		}
		else if(size==1){
			start=null;
			size--;
		}
		else {
			Node t;
			t=start;
			for(int i=1;i<size-1;i++) {
				t=t.getNext();
				t.setNext(null);
				size--;
			}
		}
	}
	
	public void deleteAtPosition(int pos) {
		if(start==null) {
			System.out.println("List is already empty");
		} else if(pos<1 ||pos>size) {
			System.out.println("Invallid position");
		} else if(pos==1) {
			deleteFirst();
		} else if(pos==size) {
			deleteLast();
		} else {
			Node t,t1;
			t=start;
			for(int i=1;i<pos-1;i++) {
				t=t.getNext();
				t1=t.getNext();
				t.setNext(t1.getNext());
				size--;
			}
		}
	}


	public void viewList() {
		Node t;
		if(isEmpty()) {
			System.out.println(start.getData());
		}else {
			t=start;
			for(int i=1;i<=size;i++) {
				System.out.println(" "+start.getData());	
				t=t.getNext();
			}
		}
	}
}
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList linkedlist = new LinkedList();
        while(true) {
        	System.out.println("1. Add item to the list at start");
        	System.out.println("2. Add item to the list at start");
        	System.out.println("3. Add item to the list at start");
        	System.out.println("4. Add item to the list at start");
        	System.out.println("5. Add item to the list at start");
        	System.out.println("6. Delete item from the list from given position");
        	System.out.println("7. Add item to the list at start");
        	System.out.println("Enter your choice");
        	int choice=sc.nextInt();
        	int position;
        	
        	switch(choice) {
        	case 1:
        	case 2:
        	case 3:
        	case 4:
        	case 5:
        	case 6:
        		System.out.println("Enter position");
        		position=sc.nextInt();
        		linkedlist.deleteAtPosition(position);
        		break;
        	case 7:
        		
        		
        	}
        }
	}

}
