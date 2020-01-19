package stack;

public class QueueHelper {

	public static void main(String[] args) {
		IQueue queue = new QueueImpl(5);
               queue.enqueue(10);		
               queue.enqueue(20);
               queue.enqueue(30);
               queue.enqueue(40);
               
               while(!queue.isEmpty()) {
            	   System.out.println(queue.dequeue());
               }
	}

}
