/**
 * 
 */
package stack;

/**
 * @author sandeepkumarsingh
 *
 */
public class StackImpl implements IStack {

	private int[] arr;
	private int defaultCapacity = 10;
	int top = -1;
	
	public StackImpl() {
		arr = new int[defaultCapacity];
	}
	
	public StackImpl(int size) {
		arr = new int[size];
	}

	@Override
	public void push(int num) {
		if(isFull()) {
			try {
				throw new Exception("stack overflow");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		arr[++top] = num;
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			try {
				throw new Exception("no element in stack");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return arr[top--];
	}

	@Override
	public int peek() {
		return arr[top];
	}

	@Override
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	@Override
	public boolean isFull() {
		return top == arr.length-1;
	}

	@Override
	public void print() {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
