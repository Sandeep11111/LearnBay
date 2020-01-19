package stack;

import java.util.Arrays;
import java.util.Stack;

public class ReplaceGreaterElementOnRightSideUsingStack {

	public static void main(String[] args) {
		int arr[] = {100,80,70,90,120};
        //int result[] = greaterElementOnRightSide_bruteForce(arr);  //time complexity = n*n
        int result[] = greaterElementOnRightSid(arr); // time complexity = n
	}

	private static int[] greaterElementOnRightSide_bruteForce(int[] arr) {
		int result1[] = new int[arr.length];
		result1[arr.length-1] = -1;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				result1[i] = arr[i];
				if(arr[j]>arr[i]) 
					result1[i] = arr[j];
				break;
				
			}
			
		}
		System.out.println("---"+Arrays.toString(result1));
		return result1;
		
	}

	private static int[] greaterElementOnRightSid(int[] arr) {
		Stack<Integer> myStack = new Stack<Integer>();
		int result[] = new int[arr.length];
		int i=0, cursor=0;
		result[arr.length-1] = -1;
		while(i<arr.length) {
			while(!myStack.empty() && arr[i] >= arr[myStack.peek()]) {
				cursor =myStack.pop();
				result[cursor] = arr[i];
				
			}
			myStack.push(i);
			i++;
		}
		System.out.println("---"+Arrays.toString(result));
		return result;
	}

}
