package stack;

import java.util.Stack;

/*
 * Solution: Use two stacks: one to store actual stack elements and other as an auxiliary stack to store minimum values.
 *  The idea is to do push() and pop() operations in such a way that the top of auxiliary stack is always the minimum. 
 *  Let us see how push() and pop() operations work*/

public class GetMinimumFromStack {

	private Stack<Integer> s; // main stack to store elements
	private Stack<Integer> aux;   // auxiliary stack to store min elements

	// Constuctor
	public GetMinimumFromStack() {
		s = new Stack<>();
		aux = new Stack<>();
	}

	// Inserts a given element on top of the stack
	public void push(int x)
	{
		// push the given element into main stack
		s.push(x);

		// if auxiliary stack is empty, push the given element into it
		if (aux.empty()) {
			aux.push(x);
		}
		else {
			// push the given element into the auxiliary stack
			// if it is less than or equal to the current minimum
			if(x <= aux.peek() && x<= s.peek()) {
				aux.push(x);
			}
		}
	}

	// Removes top element from the stack and returns it
	public int pop()
	{
		if (empty()) {
			System.out.println("Stack underflow!!");
			return -1;
		}

		// remove top element from the main stack
		int top = s.pop();

		// remove top element from the auxiliary stack
		// only if it is minimum
		if (top == aux.peek()) {
			aux.pop();
		}

		// return the removed element
		return top;
	}

	// Returns top element of the stack
	public int peek()
	{
		return s.peek();
	}

	// Returns number of elements in the stack
	public int size()
	{
		return s.size();
	}

	// Returns true if stack is empty; false otherwise
	public boolean empty()
	{
		return s.empty();
	}

	// Returns the minimum element from the stack in constant time
	public int min()
	{
		if (aux.empty()) {
			System.out.print("Stack underflow!! ");
			return -1;
		}

		return aux.peek();
	}

	public static void main(String[] args) {
		GetMinimumFromStack s = new GetMinimumFromStack(); 
		s.push(6);
		System.out.println(s.min());	// prints 6

		s.push(7);
		System.out.println(s.min());	// prints 6

		s.push(8);
		System.out.println(s.min());	// prints 6

		s.push(5);
		System.out.println(s.min());	// prints 5

		s.push(3);
		System.out.println(s.min());	// prints 3

		s.pop();
		System.out.println(s.min());	// prints 5

		s.push(10);
		System.out.println(s.min());	// prints 5

		s.pop();
		System.out.println(s.min());	// prints 5

		s.pop();
		System.out.println(s.min());	// prints 6
	}

}
