package tree;

public class FactorialByReccursion {

	public static void main(String[] args) {
		int fact = factorial(5);
		System.out.println(fact);

	}
	
private static int factorial(int n) {
		
		if (n <= 1) 
		       return n; 
		    return n * factorial(n-1); 
		    } 

}
