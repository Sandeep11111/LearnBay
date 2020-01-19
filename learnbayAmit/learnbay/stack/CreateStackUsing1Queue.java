package stack;

import java.util.LinkedList;
import java.util.Queue;

public class CreateStackUsing1Queue {

	Queue<Integer> q1;
		
	public CreateStackUsing1Queue() {
		this.q1 = new LinkedList<Integer>();
		}

	public void push(int data) {
		if(q1.isEmpty()) {
			q1.add(data);
		}else {
			int size = q1.size();
			q1.add(data);
			while(size > 0) {
				q1.add(q1.remove());
				size--;
			}
		}	
	}
	
	public static void main(String[] args) {
		CreateStackUsing1Queue st = new CreateStackUsing1Queue();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
	
	public int pop() {
		return q1.remove();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}

}
