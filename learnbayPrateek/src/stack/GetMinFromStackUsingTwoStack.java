package stack;

import java.util.Stack;

//https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/

public class GetMinFromStackUsingTwoStack extends Stack<Integer>{
	
	Stack<Integer> min = new Stack<>();
	
	/* GetMinFromStackUsingTwoStack member method to insert an element to it. This method 
    makes sure that the min stack is also updated with appropriate minimum 
    values */
	
	 void push(int x) 
	    { 
	        if(isEmpty() == true) 
	        { 
	            super.push(x); 
	            min.push(x); 
	        } 
	        else
	        { 
	            super.push(x); 
	            int y = min.pop(); 
	            min.push(y); 
	            if(x < y) 
	                min.push(x); 
	            else
	                min.push(y); 
	        } 
	    } 
	 
	 /* GetMinFromStackUsingTwoStack member method to insert an element to it. This method 
	    makes sure that the min stack is also updated with appropriate minimum 
	    values */
	    public Integer pop() 
	    { 
	        int x = super.pop(); 
	        min.pop(); 
	        return x; 
	    } 
	    
	    /* GetMinFromStackUsingTwoStack member method to get minimum element from it. */
	    int getMin() 
	    { 
	        int x = min.pop(); 
	        min.push(x); 
	        return x; 
	    } 
	
	/* Driver program to test SpecialStack methods */
    public static void main(String[] args)  
    { 
    	GetMinFromStackUsingTwoStack s = new GetMinFromStackUsingTwoStack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.getMin()); 
        s.push(5); 
        System.out.println(s.getMin()); 
    } 
}
