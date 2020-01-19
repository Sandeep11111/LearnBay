/*
 * print from 10 to 1 using one loop and loop starts with 
 * for(int i=0;)
 * 
 */
public class PrintFrom10To1 {

	public static void main(String[] args) {
		printNumbers(10);

	}

	private static void printNumbers(int n) {
		int k=n;
		for(int i=0; i<=n; i++) {
			System.out.println(""+k);
			k--;
			if(k==0) {
				
				break;
			}
		}
		
	}

}
