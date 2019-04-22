package tree;

public class FibonacciSeriesByRecccursion {

	public static void main(String[] args) {
		
		int fibnc = fibonacciSeries(5);
		System.out.println(fibnc);

	}

	private static int fibonacciSeries(int n) {
		
		if (n <= 1) 
		       return n; 
		    int temp =  fibonacciSeries(n-1) + fibonacciSeries(n-2); 
		    System.out.println(temp);
		    return temp;
		    } 
	}


