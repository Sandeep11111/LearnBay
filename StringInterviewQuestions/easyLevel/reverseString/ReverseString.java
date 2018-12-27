package reverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		
		//using reverse method of string builder
		
		String input = "Geeks for Geeks";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);
		
		// using byte array
		
		// getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result)); 
        
        // using converting string into character array
        
        char[] charArray = input.toCharArray();
        for(int i=charArray.length-1;i>=0;i--) {
        	System.out.print(charArray[i]); 
        }
        
        // Reverse a String using swapping 
        
        char[] tempArray = input.toCharArray();
        int left,right=0;
        right = tempArray.length-1;
        
        for (left=0; left < right ; left++ ,right--) {
        	// Swap values of left and right 
        	char temp = tempArray[left];
        	tempArray[left] = tempArray[right];
        	tempArray[right] = temp;
        }
        for (char c : tempArray) 
            System.out.print(c);
        
        // Using ArrayList object
        
        char[] hello = input.toCharArray(); 
        List<Character> trial1 = new ArrayList<>(); 
  
        for (char c: hello) 
            trial1.add(c); 
  
        Collections.reverse(trial1); 
        ListIterator li = trial1.listIterator(); 
        while (li.hasNext()) 
            System.out.print(li.next()); 
        
        //Using Recursion
        String str = "Welcome to Beginnersbook";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
        
	}
	
	 public static String reverseString(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        //Calling Function Recursively
	        System.out.println("-------"+str.substring(1) + str.charAt(0));
	        return reverseString(str.substring(1)) + str.charAt(0);
	    }
}
