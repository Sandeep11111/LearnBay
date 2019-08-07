package stack;

public class Helper {

	public static void main(String[] args) {
		StackImpl stackImpl = new StackImpl();
		
		StackImpl stackImpl1 = new StackImpl();
		stackImpl1.push(5);
		stackImpl1.push(4);
		stackImpl1.push(3);
		stackImpl1.push(2);
		
		stackImpl1.print();
		
	}

}
