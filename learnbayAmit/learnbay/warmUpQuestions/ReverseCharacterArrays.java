/**
 * 
 */
package warmUpQuestions;

import java.util.Arrays;

/**
 * @author sandeepkumarsingh
 * 
 * i/p = learnbay
 * o/p = yabnrael
 */
public class ReverseCharacterArrays {
	
	public static void main(String[] args) {
		String str = "learnbay";
		char [] array = str.toCharArray();
		ReverseCharacterArrays rv = new ReverseCharacterArrays();

		//approach1
		//rv.reverseUsingLoop(array);

		//approach2
		rv.reverseUsingSwap(array);
	}

	private void reverseUsingSwap(char[] input) {
		if(input == null || input.length <= 1) {
			return;
		}

		for(int i=0; i<input.length/2; i++) {
			int temp = input[i];
			input[i] = input[input.length-1-i];
			input[input.length-1-i] = (char) temp;
		}	
		System.out.println(""+Arrays.toString(input));
	}

	private void reverseUsingLoop(char[] array) {
		for(int i = array.length-1; i >= 0 ; i--) {
			System.out.println(array[i]);
		}

	}

}
