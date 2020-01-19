
public class FindLastCharacterOfString {

	public static void main(String[] args) {
		String str = "Geeks for Geeks"; 
        printLastChar(str); 

	}

	private static void printLastChar(String str) {
		// Now, last word is also followed by a space 
        str = str + " "; 
        for (int i = 1; i < str.length(); i++) { 
  
            // If current character is a space 
            if (str.charAt(i) == ' ') 
  
                // Then previous character must be 
                // the last character of some word 
                System.out.print(str.charAt(i - 1) + " "); 
        } 
		
	}

}
