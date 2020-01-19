/**
 * 
 */
package reccursion;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sandeepkumarsingh
 *
 */
public class ReverseQueueUsingReccursion {
	static Queue<Integer> queue; 
	   
    // Utility function to print the queue 
    static void Print() 
    { 
        while (!queue.isEmpty())  
        { 
            System.out.print(queue.peek() + " "); 
            queue.remove(); 
        } 
    } 
	public static void main(String[] args) {
		queue = new LinkedList<Integer>(); 
	    queue.add(1); 
	    queue.add(2); 
	    queue.add(3); 
	    queue.add(4); 
	    //Print(); 
	    queue = reverseQueue(queue); 
	    Print(); 

	}
	private static Queue<Integer> reverseQueue(Queue<Integer> queue2) {
		int data;
		if(queue2.isEmpty()) {
			return queue2;
		} else {
			// Dequeue current item (from front)   
		    data = queue2.peek(); 
		    queue2.remove(); 
		    
		 // Reverse remaining queue   
		    queue2 = reverseQueue(queue2); 
		
		    // Enqueue current item (to rear)   
		    queue2.add(data); 
		          
		    return queue2; 
		}
	}
	}


