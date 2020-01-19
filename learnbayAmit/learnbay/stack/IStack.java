/**
 * 
 */
package stack;

/**
 * @author sandeepkumarsingh
 *
 */
public interface IStack {

    void push (int num);
	
	int pop();
	
	int peek();
	
	boolean isEmpty();
	
	boolean isFull();

	void print();
}
