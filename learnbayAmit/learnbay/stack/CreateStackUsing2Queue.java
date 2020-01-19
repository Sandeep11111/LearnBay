package stack;

import java.util.LinkedList;
import java.util.Queue;

public class CreateStackUsing2Queue {

	Queue<Integer> q1;
	Queue<Integer> q2;
	
	public CreateStackUsing2Queue() {
		this.q1 = new LinkedList<Integer>();
		this.q2 = new LinkedList<Integer>();
	}

	public void push(int data) {
		if(q1.isEmpty()) {
			q1.add(data);
		}else {
			while(!q1.isEmpty()) {
				q2.add(q1.remove());
			}
			q1.add(data);
			while(!q2.isEmpty()) {
				q1.add(q1.remove());
			}
		}
	}
	
	public static void main(String[] args) {
		CreateStackUsing2Queue st = new CreateStackUsing2Queue();
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
