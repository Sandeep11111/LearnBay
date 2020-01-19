/**
 * 
 */
package stack;

/**
 * @author sandeepkumarsingh
 *
 */
public class QueueImpl implements IQueue{

	private int[] arr; // hold the data
	int front;  // front pointer is for deletion
	int rear;  // rear pointer is for  insertion
	int maxSize;
	private int defaultCapacity = 10;
	
	public QueueImpl() {
		arr = new int[defaultCapacity]; 
		front = 0;
		rear = -1;
	}
	
	public QueueImpl(int size) {
		this.arr = new int[size];
		this.front = 0;
		this.rear = -1;
		this.maxSize = size;
	}

	@Override
	public void enqueue(int data) {
		if(!isFull()) {
		arr[++rear]  = data;
		}
	}

	@Override
	public int dequeue() {
		if(!isEmpty()) {
		return arr[front++];
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return (rear == -1 || front == (maxSize-1));
	}

	@Override
	public boolean isFull() {
		return (rear == (maxSize-1));
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
