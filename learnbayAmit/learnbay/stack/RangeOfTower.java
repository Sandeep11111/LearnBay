package stack;

import java.util.Arrays;
import java.util.Stack;

/*
 * 
 * 
 *  find range of each tower
 *  input:- 100 80 70 90 120
 *  output:- 1  1  1  3   5
 * 
 */
public class RangeOfTower {
	
	public static int[] findRange_bruteForce(int arr[]) {
		int result[] = new int[arr.length];
		result[0]=1;
		for(int i=1; i<arr.length;i++) {
			for(int j=i; j>=0;j--) {
				if(arr[j]<=arr[i]) {
					result[i] +=1;
				}else {
					break;
				}
			}
		}
		System.out.println("---"+Arrays.toString(result));
		return result;
	}

	public static void main(String[] args) {
		int arr[] = {100,80,70,90,120};
        //int result[] = findRange_bruteForce(arr);// time complexity = n*n
        int result[] = findRange(arr); // time complexity = n
	}

	private static int[] findRange(int[] arr) {
		Stack<Integer> myStack = new Stack<Integer>();
		int result[] = new int[arr.length];
		int i=0;
		while(i<arr.length) {
			while(myStack.empty() == false && arr[i] >= arr[myStack.peek()]) {
				myStack.pop();
				if(myStack.isEmpty()) {
					result[i] = i+1;
				}else {
					result[i] = i-myStack.peek();
				}
				
			}
			myStack.push(i);
			i++;
		}
		System.out.println("---"+Arrays.toString(result));
		return result;
	}
}
