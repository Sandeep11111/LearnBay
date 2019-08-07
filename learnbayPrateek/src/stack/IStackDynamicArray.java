package stack;

public interface IStackDynamicArray {
	
	void push (int num);
	
	int pop();
	
	int peek();
	
	boolean isEmpty();
	
	boolean isFull();

	void print();
}
