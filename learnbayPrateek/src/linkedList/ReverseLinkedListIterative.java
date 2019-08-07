package linkedList;
//https://www.geeksforgeeks.org/reverse-a-linked-list/
public class ReverseLinkedListIterative {
 
	static Node head; 
	  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to reverse the linked list */
    Node reverse(Node node) { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            System.out.println("next"+next);
            current.next = prev; 
            System.out.println("current.next"+current.next);
            prev = current; 
            System.out.println("prev"+prev);
            current = next; 
            System.out.println("current"+current);
        } 
        node = prev; 
        return node; 
    } 
  
    // prints content of double linked list 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
    	ReverseLinkedListIterative list = new ReverseLinkedListIterative(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
          
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
}
