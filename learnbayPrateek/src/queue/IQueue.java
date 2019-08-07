package queue;

public interface IQueue {

	void enqueue(int item);
	
	boolean isEmpty(QueueImpl queue);
	
	int front();
	
	int rear();

	boolean isFull(QueueImpl queue);

	int dequeue();
}
