package reccursion;

/*
  
 */
public class ReccursionTest2 {

	public static void main(String[] args) {
		reccursionTest(5);

	}

	private static void reccursionTest(int n) {
		if(n>0) {
			for(int i=n;i>1;i=n/2) {
				System.out.print(i);
				
			}
			System.out.println();
			reccursionTest(n-1);
		}
		
	}

}
