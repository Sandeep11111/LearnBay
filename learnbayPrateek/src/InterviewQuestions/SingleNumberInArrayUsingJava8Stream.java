package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SingleNumberInArrayUsingJava8Stream {

	public static void main(String args[]) 
    { 
        int arr[] = {1,5,6,2,1,6,4,3,2,5,3}; 
        int n = arr.length; 
        System.out.println("Element occurring once is " + 
                findSingle(arr, n) + " "); 
    }

	static int findSingle(int ar[], int ar_size) 
    { 
        // Do XOR of all elements and return 
        int res = ar[0]; 
        for (int i = 1; i < ar_size; i++) 
            res = res ^ ar[i]; 
      
        return res; 
    } 
}
