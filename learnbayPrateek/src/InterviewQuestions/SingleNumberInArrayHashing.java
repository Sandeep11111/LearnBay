package InterviewQuestions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;



public class SingleNumberInArrayHashing {
	
	public static void main(String args[]) 
    { 
        int arr[] = {1,5,6,2,1,6,4,3,2,5,3}; 
        int n = arr.length; 
        getSingle(arr, n); 
    }

	private static void getSingle(int[] inputArray, int n) {
		 HashMap<Integer, Integer> map = new HashMap<>();
         
	        for (int element : inputArray) 
	        {   
	            if(map.get(element) == null)
	            {
	                map.put(element, 1);
	            }
	            else
	            {
	                map.put(element, map.get(element)+1);
	            }
	        }
	       
	        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
	         
	        for (Entry<Integer, Integer> entry : entrySet) 
	        {               
	            if(entry.getValue() > 1)
	            {
	                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	            }
	        }
		
	}
	
	

}
