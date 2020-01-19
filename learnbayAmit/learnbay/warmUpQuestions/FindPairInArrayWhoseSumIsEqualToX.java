package warmUpQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 *  Given an array of integers, Find Pair In Array Whose Sum Is Equal To X
 *  i/p = 10 8 2 4 3 7  1
 *  o/p = 2,4
 */
public class FindPairInArrayWhoseSumIsEqualToX {

	public static void main(String[] args) {
		int [] myIntArray = {10,8,2,4,3,7,1,3,5};
		int sum = 6;
		FindPairInArrayWhoseSumIsEqualToX solution = new FindPairInArrayWhoseSumIsEqualToX();
		//solution.throughLoop(myIntArray, sum); // t.c = n*n
		
		// using one traversal
		prettyPrint(getRandomArray(9), 11);
	    prettyPrint(getRandomArray(10), 12);
	}

	/** * Utility method to return random array of Integers in a range of 0 to 15 */ 
	public static int[] getRandomArray(int length){ 
		int[] randoms = new int[length]; 
		for(int i=0; i<length; i++){ 
			randoms[i] = (int) (Math.random()*15);
			} 
		return randoms; 
	}
	
	/* * Utility method to find two elements in an array that sum to k. */
	public static void prettyPrint(int[] random, int k){ 
		System.out.println("Random Integer array : " + Arrays.toString(random));
		System.out.println("Sum : " + k); 
		System.out.println("pair of numbers from an array whose sum equals " + k); 
		printPairsUsingSet(random, k); 
	}

	/** * Given an array of integers finds two elements in the array whose sum is equal to n. 
	 * * @param numbers * @param n */ 
	public static void printPairsUsingSet(int[] numbers, int n){ 
		if(numbers.length < 2){ 
			return; 
			} 
		Set<Integer> set = new HashSet<Integer>(numbers.length); 
		for(int value : numbers){ 
			int target = n - value; 
			// if target number is not in set then add 
			if(!set.contains(target)){ 
				set.add(value); 
				}
			else { 
				System.out.printf("(%d, %d) %n", value, target); 
				} 
			} 
		}


	private void throughLoop(int[] input, int sum) {
		// outer loop
		for (int i = 0; i < input.length - 1; i++) {
			// inner loop
			for (int j = i + 1; j < input.length - 1; j++) {
				if (input[i] + input[j] == sum) {
					System.out.println("---" + input[i] + "," + input[j]);
				}
			}
		}
	}
}
