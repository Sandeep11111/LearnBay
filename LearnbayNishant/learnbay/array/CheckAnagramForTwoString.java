/**
 * 
 */
package array;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagramForTwoString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char str1[] = {'t','e','s','t'}; 
        char str2[] = {'t','t','e','s'}; 
        if (areAnagramThroughSort(str1, str2)) {
            System.out.println("The two strings are"+ 
                           " anagram of each other"); 
        }
        else {
            System.out.println("The two strings are not"+ 
                               " anagram of each other"); 
        }
        if (areAnagramThroughHashMap(str1, str2)) {
            System.out.println("The two strings are"+ 
                             " anagram of each other"); 
        }
        else {
            System.out.println("The two strings are not"+ 
                               " anagram of each other");
        }
        if (areAnagramThroughXOR(str1, str2)) {
            System.out.println("The two strings are"+ 
                             " anagram of each other"); 
        }
        else {
            System.out.println("The two strings are not"+ 
                               " anagram of each other");
        }
    }
	
	

	



	// Process1 sort both strings and compare the sorted strings 
    // T.c = n(logn)
	private static boolean areAnagramThroughSort(char[] str1, char[] str2) {
		
		int str1Length = str1.length;
        for (int i = 0; i < str1Length-1; i++) {
            for (int j = 0; j < str1Length-i-1; j++) {
            	
            	
                if (str1[j] > str1[j+1])
                {
                    // swap temp and str1[i]
                    char temp = str1[j];
                    str1[j] = str1[j+1];
                    str1[j+1] = temp;
                }
            }
        }
        int str2Length = str2.length;
        for (int i = 0; i < str2Length-1; i++) {
            for (int j = 0; j < str2Length-i-1; j++) {
            	
            	
                if (str2[j] > str2[j+1])
                {
                    // swap temp and str1[i]
                    char temp = str2[j];
                    str2[j] = str2[j+1];
                    str2[j+1] = temp;
                }
            }
        }
     // Compare sorted strings 
        for (int i = 0; i < str1Length;  i++) {
            if (str1[i] != str2[i]) 
                return false;
        }
		return true;
	} 

	//  Process2 hashMap 
    //  T.c = o(n)
	private static boolean areAnagramThroughHashMap(char[] str1, char[] str2) {
		
		Map<Character,Integer> map = new HashMap();
		
		for(char c: str1) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(char c:str2) {
			if(!map.containsKey(c)){
				return false;
			}
			else {
				map.put(c, map.get(c)-1);
				
				if(map.get(c) == 0) {
					return true;
				}
			}
			
		}
		
		
		return false;
		
	}
	
	private static boolean areAnagramThroughXOR(char[] str1, char[] str2) {
		char str11[] = {'a','a','a'}; 
        char str22[] = {'b','b','b'}; 
		 int xor = 0;
		 
         for (int i = 0; i < str11.length; i++)
         {
             xor ^= str11[i] ^ str22[i];
         }

         if (xor == 0)
         {
             return true;    
         }
		return false;
	}
}


