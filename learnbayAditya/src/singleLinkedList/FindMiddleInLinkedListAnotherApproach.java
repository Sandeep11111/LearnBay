package singleLinkedList;

//https://javarevisited.blogspot.com/2012/12/how-to-find-middle-element-of-linked-list-one-pass.html
//https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
/**
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of a linked list 
 * we need to find the length first but since we can only 
 * traverse linked list one time, we will have to use two pointers
 * one which we will increment on each iteration while 
 * other which will be incremented every second iteration.
 * So when the first pointer will point to the end of a 
 * linked list, second will be pointing to the middle 
 * element of a linked list
 *
 * 
 */



public class FindMiddleInLinkedListAnotherApproach {
	Node head; // head of linked list 
	  
    /* Linked list node */
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
    
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
    
    /* Function to print middle of linked list */
    void printMiddle() 
    { 
        Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
            System.out.println("The middle element is [" + 
                                slow_ptr.data + "] \n"); 
        } 
    } 
    
    public static void main(String [] args) 
    { 
    	FindMiddleInLinkedListAnotherApproach llist = new FindMiddleInLinkedListAnotherApproach(); 
        for (int i=5; i>0; --i) 
        { 
            llist.push(i); 
            llist.printList(); 
            llist.printMiddle(); 
        } 
    } 
}
