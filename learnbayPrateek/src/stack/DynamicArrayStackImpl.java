package stack;

public class DynamicArrayStackImpl implements IStackDynamicArray {

	private int[] arr;

	int top = -1;

	private int defaultCapacity = 10;

	public DynamicArrayStackImpl() {
		arr = new int[defaultCapacity];
	}

	public DynamicArrayStackImpl(int size) {
		arr = new int[size];
	}

	@Override
	public void push(int num) {
		if (isFull()) {
			expand();
		}
		arr[++top] = num;

	}

	// Double the stack size - if stack is full expand
	private void expand() {

		// double the capacity
		defaultCapacity = defaultCapacity * 2;

		// create new array with double capacity
		int[] newStack = new int[defaultCapacity];

		// copy old stack into new stack array
		System.arraycopy(arr, 0, newStack, 0, arr.length);

		// copy old stack to stackArray.
		arr = newStack;

	}

	@Override
	public int pop() {
		if (isEmpty()) {
			try {
				throw new Exception("no element in stack");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// shrink if stack size is less than 3/4.
		shrink();
		return arr[top--];
	}

	private void shrink() {
//		  //IF 1/2 array size is greater than INITIAL_CAPACITY size.
//		         //So that not shrink array less than INITIAL_CAPACITY
//		         if (INITIAL_CAPACITY <= (capacity >> 2)) {
//		             //Get 3/4 size
//		             int minSize = capacity >> 2;
//		             if (top < minSize) {
//		                 //so stack is less than 3/4.
//		                  
//		                 //divide capacity by 2. So new size is 1/2;
//		                 capacity = capacity / 2;
//		                  
//		                 //create new array with new capacity
//		                 int[] newStack = new int[capacity];
//		                  
//		                 //copy old stack into new stack array
//		                 System.arraycopy(stackArray, 0, newStack, 0, size());
//		                  
//		                 //assign new stack to stackArray.
//		                 stackArray = newStack;
//		             }
//		         }

	}

	@Override
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	@Override
	public int peek() {
		return arr[top];
	}

	@Override
	public boolean isFull() {
		return top == arr.length - 1;
	}

	@Override
	public void print() {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
