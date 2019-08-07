package queue;

/*
 * Time Complexity : The outer loop runs n-k+1 times and the inner loop runs k times for every iteration of outer loop. 
 * So time complexity is O((n-k+1)*k) which can also be written as O(nk).
 */
public class SlidingWindowMaximumOfSizeKUsingBruteForce {
	
	// Method to find the maximum for each and every contiguous subarray of size k. 
    static void printKMax(int arr[], int n, int k)  
    { 
        int j, max; 
  
        for (int i = 0; i <= n - k; i++) { 
              
            max = arr[i]; 
  
            for (j = 1; j < k; j++)  
            { 
                if (arr[i+j] > max) {
                	//System.out.println("arr[i]"+arr[i]);
                	//System.out.println("arr[j]"+arr[j]);
                	//System.out.println("arr[i + j]"+arr[i + j]);
                    max = arr[i+j]; 
                	//System.out.println("max---"+max);
                }
            } 
            System.out.print(max + " "); 
        } 
    }

	public static void main(String[] args) {
		 int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
	        int k = 3; 
	        printKMax(arr, arr.length, k); 

	}

}
