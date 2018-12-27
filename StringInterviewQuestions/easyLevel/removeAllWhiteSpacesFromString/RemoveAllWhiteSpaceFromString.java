package removeAllWhiteSpacesFromString;

public class RemoveAllWhiteSpaceFromString {

	public static void main(String[] args) {
		
		//removing white space from String from beginning and end in Java       
        String strWhiteSpace = "    This String contains White Space at beginning and end and middle    ";
        System.out.printf("String before removing White space : %n %s %n", strWhiteSpace);
        System.out.printf("length of String before removing white space %d : ", strWhiteSpace.length());
        
        String strWithoutWhiteSpace = strWhiteSpace.trim();
        System.out.printf("String after removing white space from beginning and end %n %s %n", strWithoutWhiteSpace);
        System.out.printf("length of String before removing white space %d : ", strWhiteSpace.length());
        
      //removing white space between String in Java
        String whitespace = "ABC DEF GHI";
        System.out.println("String with white space between words: " + whitespace);
      
        // \s is regular expression for white space tab etc
        String withoutspace = whitespace.replaceAll("\\s", "");
        System.out.println("String after removing white space between words and everywhere: " + withoutspace); 

        // without inbuilt functions
        String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
            char[] charArray = str.toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int i =0; i<charArray.length;i++) {
            	if(charArray[i]!= ' ' && charArray[i]!= '\t') {
            		sb.append(charArray[i]);
            	}
            }
            System.out.print("without inbuilt functions---"+sb);
	}

}
