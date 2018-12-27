package firstNonRepeatedCharacterOfString;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterOfString {

	public static void main(String[] args) {
		
        // using no inbuilt function
		
		String source = "ffeeddbbaaclck";
		
		// Process1
	       char[] chars = source.toCharArray();
	       Arrays.sort(chars);
	       String sorted = String.valueOf(chars);
	       char ch = 0;
	       for (int i = 0; i < sorted.length(); i++) {
	           if (i == 0) {
	              if (sorted.charAt(i) != sorted.charAt(i + 1)) {
	                 ch = sorted.charAt(i);
	              }
	           } else {
	                  if (i == sorted.length() - 1) {
	                     if (sorted.charAt(i) != sorted.charAt(i - 1)) {
	                        ch = sorted.charAt(i);
	                     }
	                  } else {
	                        if (sorted.charAt(i) != sorted.charAt(i + 1)
	                              && sorted.charAt(i) != sorted.charAt(i - 1)) {
	                           ch = sorted.charAt(i);
	                        }
	                  }
	           }
	       }
	       System.out.println("First non repeated character in String \"" + source + 
	       "\" :" + ch);
	       
	    // Process2
	       String source1 = "ffeeddbbaaclck";
	       for(int i=0; i<source1.length(); i++) {
	    	   boolean unique = true;
	    	   for(int j=0; j<source1.length(); j++) {
	    		   if(i!=j && source1.charAt(i)==source1.charAt(j)) {
	    			   unique=false;
	    			   System.out.println(source1.charAt(i)+"----RepeatingFirstCharacter");
	    			   break;
	    		   }
	    	   }
	    	   if (unique) {
	                 System.out.println("First non repeated characted in String \""
	                 + source1 + "\" is:" + source1.charAt(i));
	                 break;
	             }
	       }
	       
	    // Process3
	       String source3 = "ffeeddbbaaclck";
	       for (char c : source3.toCharArray()) {
	           if (source3.indexOf(c) == source3.lastIndexOf(c)) {
	               System.out.println("First non repeated characted in String \""
	               + source3 + "\" is:" + c);
	               break;
	           }
	       }
	       
	       // Process4 Using LinkedHashMap
	       String source4 = "ffeeddbbaaclck";
	       Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	       char c[] = source4.toCharArray();
	       for(char cha: c) {
	    	   if(map.containsKey(cha)) {
	    		   int count = map.get(cha);
	    		   map.put(cha, count+1);
	    	   }else {
	    		   map.put(cha, 1);
	    	   }
	       }
	       
	       for(char cha: c) {
	    	   if(map.get(cha) == 1) {
	    		   System.out.println("First non repeated characted in String Using LinkedHashMap\""
	    		              + source4 + "\" is:" + cha);
	    		              break;
	    	   }
	       }
	       
	    }
	}


