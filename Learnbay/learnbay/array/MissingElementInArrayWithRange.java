package array;

/*Given a array with n-1 elements having one missing element
and every element is in range [1,n] find the missing element.

i/p: 2 1 3 5 6
o/p: 4 */

public class MissingElementInArrayWithRange {

	public static void main(String[] args) {
		int array [] = new int[] {2,1,3,5,6};
		
		//process1
		int missing = getMissingNumber(array,array.length);
		System.out.println(missing);
		
		//process2 by XOR
		int missingXor = getMissingNumberByXor(array,array.length);
		System.out.println(missingXor);
	}

	private static int getMissingNumberByXor(int[] array, int length) {
		int i;
		int x1 = array[0];//for xor of all the element in array
		int x2 = 1;//for xor of all the element from 1 to n+1
		
		for(i=1;i<length;i++) {
			x1 = x1^array[i];
		}
		for(i=2;i<length+2;i++) {
			x2 = x2^i;
		}
		return x1^x2;
	}

	private static int getMissingNumber(int[] array, int n) {
		int total;
		total = (n+1)*(n+2)/2;
		for(int i=0;i<array.length;i++) {
			total -= array[i];
		}
		return total;
	}
	
	

}
