package queue;

public class QueueImpl implements IQueue {

	int front, rear, size; 
    int  capacity; 
    int array[]; 
       
    public QueueImpl(int capacity) { 
         this.capacity = capacity; 
         front = this.size = 0;  
         rear = capacity - 1; 
         array = new int[this.capacity]; 
            
    } 
    
	@Override
	public void enqueue(int item) {
		{ 
	        if (isFull(this)) 
	            return; 
	        this.rear = (this.rear + 1)%this.capacity; 
	        this.array[this.rear] = item; 
	        this.size = this.size + 1; 
	        System.out.println(item+ " enqueued to queue"); 
	    } 
		
	}

	@Override
	public int dequeue() {
		{ 
	        if (isEmpty(this)) 
	            return Integer.MIN_VALUE; 
	           
	        int item = this.array[this.front]; 
	        this.front = (this.front + 1)%this.capacity; 
	        this.size = this.size - 1; 
	        return item; 
	    } 
	}

	@Override
	public boolean isFull(QueueImpl queue) {
		  return (queue.size == queue.capacity); 
	    
	}

	@Override
	public boolean isEmpty(QueueImpl queue) {
		{  return (queue.size == 0); } 
	}

	@Override
	public int front() {
		 if (isEmpty(this)) 
	            return Integer.MIN_VALUE; 
	           
	        return this.array[this.front]; 
	}

	@Override
	public int rear() {
		 if (isEmpty(this)) 
	            return Integer.MIN_VALUE; 
	           
	        return this.array[this.rear]; 
	}
	
	 
	    public static void main(String[] args)  
	    { 
	        IQueue queue = new QueueImpl(1000); 
	            
	        queue.enqueue(10); 
	        queue.enqueue(20); 
	        queue.enqueue(30); 
	        queue.enqueue(40); 
	        
	        System.out.println(queue.dequeue() +  
	                     " dequeued from queue\n"); 
	        
	        System.out.println("Front item is " +  
	                               queue.front()); 
	           
	        System.out.println("Rear item is " +  
	                                queue.rear()); 
	    
	}
}

