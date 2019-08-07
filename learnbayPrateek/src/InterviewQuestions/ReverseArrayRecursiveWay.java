package InterviewQuestions;

public class ReverseArrayRecursiveWay {

	static void rvereseArray(int arr[], int start, int end) 
	{ 
	    if (start >= end) 
	    return; 
	      
	    int temp = arr[start];  
	    arr[start] = arr[end]; 
	    arr[end] = temp; 
	      
	    // Recursive Function calling 
	    rvereseArray(arr, start + 1, end - 1);  
	} 
	
	/* Utility that prints out an array on a line */
    static void printArray(int arr[], int size) 
    { 
        for (int i=0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
  
    /*Driver function to check for above functions*/
    public static void main (String[] args) { 
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        printArray(arr, 6); 
        rvereseArray(arr, 0, 5); 
        System.out.println("Reversed array is "); 
        printArray(arr, 6); 
    } 
}
