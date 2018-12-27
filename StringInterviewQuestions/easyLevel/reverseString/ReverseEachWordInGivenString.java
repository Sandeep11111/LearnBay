package reverseString;

public class ReverseEachWordInGivenString {

	public static void main(String[] args) {
		String string = "Java Concept Of The Day";
        String[] words = string.split(" ");
        
        String reverseString = "";
        
        for(int i=0;i<words.length;i++) {
        	String word =words[i];
        	String reverseWord="";
        	
        	 for (int j = word.length()-1; j >= 0; j--) 
             {
                 reverseWord = reverseWord + word.charAt(j);
             }
              
             reverseString = reverseString + reverseWord + " ";
         }
          
         System.out.println(string);
          
         System.out.println(reverseString);
          
         System.out.println("-------------------------");
         
         // another way
         
         for (String part : string.split(" ")) {
        	    System.out.print(new StringBuilder(part).reverse().toString());
        	    System.out.print(" ");
        	}
     
        }
	}


