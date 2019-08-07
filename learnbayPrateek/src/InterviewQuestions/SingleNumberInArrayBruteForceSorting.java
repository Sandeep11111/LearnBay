package InterviewQuestions;

import java.util.Arrays;

public class SingleNumberInArrayBruteForceSorting {
	
	public static void main(String args[]) 
    { 
        int arr[] = {1,5,6,2,1,6,4,3,2,5,3}; 
        int n = arr.length; 
        getSingle(arr, n); 
    }

	private static void getSingle(int[] arr, int n) {
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			//less than 0
			if(arr[i-1]<0) {
				if(arr[i]==arr[i+1]) {
					System.out.println(arr[i]);
				}
				//greater than length
			} else if(arr[i-1] > arr.length) {
				if(arr[i]==arr[i-1]) {
					System.out.println(arr[i]);
				}
			}
			//middle element
			if(arr[i]==arr[i-1] || arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
