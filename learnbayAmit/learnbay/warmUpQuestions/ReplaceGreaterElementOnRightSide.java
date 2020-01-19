package warmUpQuestions;

import java.util.Arrays;

/*
 *  Given an array of integers, replace each integer with greatest element on right side
 *  i/p = 10 8 2 4 3 7  1
 *  o/p = 8  7 7 7 7 1 -1
 */

public class ReplaceGreaterElementOnRightSide {

	public static void main(String[] args) {
		int [] myIntArray = {10,8,2,4,3,7,1};
		
		ReplaceGreaterElementOnRightSide solution = new ReplaceGreaterElementOnRightSide();
        solution.replaceUsingLoop(myIntArray); // t.c - n*n
        solution.replaceUsingOneTraversal(myIntArray); // t.c - n
	}

	
	private void replaceUsingOneTraversal(int[] myIntArray) {
		
		/* Initialize the next greatest element */
		int maxFromRight = myIntArray.length - 1;
		
		/* The next greatest element for the rightmost element
	      is always -1 */
		myIntArray[myIntArray.length - 1] = -1;
		
		/*Replace all other elements with the next greatest*/
		  for(int i = myIntArray.length - 2; i >= 0; i--)
		  {
		    /* Store the current element (needed later for updating
		        the next greatest element)*/
		    int temp = myIntArray[i];
		 
		    /* Replace current element with the next greatest*/
		    myIntArray[i] = maxFromRight;
		 
		    /* Update the greatest element, if needed*/
		    if(maxFromRight < temp)
		    	maxFromRight = temp;
		  }
		  printOutput(myIntArray);
	}


	private void replaceUsingLoop(int[] input) {
		int max = 0;
		
		// outer loop
		for(int i = 0; i< input.length-1 ; i++) {
			// inner loop
			for(int j = i+1; j<input.length-1; j++) {
				if(input[j] > max) {
					max = input[j];
				}
			}
			int temp = input[i];
			input[i] = max;
		}
		input[input.length-1] = -1;
		printOutput(input);
	}


	private void printOutput(int[] input) {
		for(int k = 0; k<input.length; k++) {
			System.out.println(""+Arrays.toString(input));
		}
	}

}
