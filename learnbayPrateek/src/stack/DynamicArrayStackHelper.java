package stack;

public class DynamicArrayStackHelper {

	public static void main(String[] args) {
		DynamicArrayStackImpl stackImpl = new DynamicArrayStackImpl();
		
		DynamicArrayStackImpl stackImpl1 = new DynamicArrayStackImpl();
		stackImpl1.push(5);
		stackImpl1.push(4);
		stackImpl1.push(3);
		stackImpl1.push(2);
		
		stackImpl1.print();
		
	}

}
