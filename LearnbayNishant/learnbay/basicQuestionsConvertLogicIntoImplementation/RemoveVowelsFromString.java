package basicQuestionsConvertLogicIntoImplementation;

import java.util.Arrays;
import java.util.List;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		
		//Process1
		String element = "wneixnau";
        char charArray[] = element.toCharArray();
        char vowel[] = new char[charArray.length];
        char nonVowel[] = new char[charArray.length];
        for(int i=0;i<charArray.length;i++) {
        	if(charArray[i] == 'a'||charArray[i] == 'e'||charArray[i] == 'i'||charArray[i] == 'o'||charArray[i] == 'u') {
        		vowel[i]=charArray[i];
        		//System.out.println("vowel"+vowel[i]);
        	}else {
        		nonVowel[i]=charArray[i];
        		//System.out.println("nonVowel"+nonVowel[i]);
        	}
        	
        }
        
        //Process2
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks"; 
        
        System.out.println(remVowel(str)); 
       
	}
	
	 static String remVowel(String str) 
	    { 
	         Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
	           
	         List<Character> al = Arrays.asList(vowels); 
	           
	         StringBuffer sb = new StringBuffer(str); 
	           
	         for (int i = 0; i < sb.length(); i++) { 
	              
	             if(al.contains(sb.charAt(i))){ 
	                sb.replace(i, i+1, "") ; 
	                i--; 
	             } 
	        } 
	           
	          
	        return sb.toString(); 
	    } 

}
