package polindrome;

import java.util.ArrayList;
import java.util.HashMap;

public class FindPolindrome {

	/*
	 * Given an array of strings, find if two strings concatenate to form a palindrome in linear time.
	 * Example: {"cat","tac", "rac","car,"ta","abc"}
	 * 
	 * O(N)
	 * 
	 */
	
	
	private ArrayList<String> findPalindromePairs(String[] input) {
        ArrayList<String> list = new ArrayList<>();
        
        if(null == input) {
            return list;
        }
        
        int len = input.length;
        if(len <= 1) {
            return list;
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        
        for(String str : input) {
            count = 0;            
            if(map.containsKey(str)) {
                count = map.get(str);
            }
            
            map.put(str, ++count);
        }
        
        String rev = "";
        for(String str : input) {
            rev = new StringBuilder(str).reverse().toString();
            
            if(map.containsKey(rev)) {
                count = map.get(rev);
                
                if(count > 0) {
                    map.put(str, --count);
                    map.put(rev, --count);
                    
                    list.add(str + " : " + rev);
                }
            }
        }

        return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindPolindrome obj = new FindPolindrome();
	        String input[] = {"cat","tac", "rac","car", "ta","abc"};
	        
	        ArrayList<String> output = obj.findPalindromePairs(input);
	        
	        for(String palPair : output) {
	            String pair[] = palPair.split(" : ");
	            
	            System.out.println(pair[0] + "\t" + " : " + "\t" + pair[1]);
	        }
	    }

}
