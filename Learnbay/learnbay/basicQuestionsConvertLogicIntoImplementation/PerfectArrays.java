package basicQuestionsConvertLogicIntoImplementation;

public class PerfectArrays {

	public static void main(String[] args) {
		//https://www.geeksforgeeks.org/check-whether-given-array-perfect-not/
		int numbers[] = new int[] {1, 5, 5, 5, 4, 2};
		int n = numbers.length-1;
		if (checkUnimodal(numbers, n)) 
	        System.out.println("yes");
	    else
	    	 System.out.println("no");

	}

	static boolean checkUnimodal(int arr[], int n) 
	{ 
	    // Cover first strictly increasing part 
	    int i = 1; 
	    while (arr[i] > arr[i - 1] && i < n) 
	        ++i; 
	  
	    // Cover middle equal part 
	    while (arr[i] == arr[i - 1] && i < n) 
	        ++i; 
	  
	    // Cover last decreasing part 
	    while (arr[i] < arr[i - 1] && i < n) 
	        ++i; 
	  
	    // Return true if we reached end. 
	    return (i == n); 
	} 

}
