package InterviewQuestions;

public class MoveAllZerosToEndOfArray {

	public static void main (String[] args) { 
        int arr[] = {1, 0, 3, 0, 5, 0,}; 
        printArray(arr, 6); 
        movedArray(arr, 0, 5); 
        System.out.println("moved array is "); 
        printArray(arr, 6); 
    }

	private static void movedArray(int[] arr, int start, int end) {
		
		int temp; 
        
        while (start < end) 
        { 
        	if(arr[start] == 0) {
            temp = arr[start];  
            arr[start] = arr[end]; 
            arr[end] = temp; 
        	}
            start++; 
            end--; 
        } 
		
	}

	 static void printArray(int arr[],  
             int size) 
{ 
       for (int i = 0; i < size; i++) 
           System.out.print(arr[i] + " "); 

           System.out.println(); 
} 
}
