package reccursion;

/*
 * 01234
   0123
   012
   01
   0
 * 
 */
public class ReccursionTest {

	public static void main(String[] args) {
		reccursionTest(5);

	}

	private static void reccursionTest(int n) {
		if(n>0) {
			for(int i=0;i<n;i++) {
				System.out.print(i);
				
			}
			System.out.println();
			reccursionTest(n-1);
		}
		
	}

}
