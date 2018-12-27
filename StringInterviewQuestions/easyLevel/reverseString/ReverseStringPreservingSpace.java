package reverseString;

public class ReverseStringPreservingSpace {

	public static void main(String[] args) {
		
		// without using any inbuilt functions
		String input = "India Is my country";
		
		char[] inputArray = input.toCharArray();  
        char[] result = new char[inputArray.length];  

        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] == ' ') {  
                result[i] = ' ';  
            }  
        } 
        
        int j = result.length - 1;  
        
        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] != ' ') {  
                if (result[j] == ' ') {  
                    j--;  
                }  
                result[j] = inputArray[i];  
                j--;  
            }  
        }  
        System.out.println(input + " --> " + String.valueOf(result));  
        
        // Using Split functions
        
        String strArray[] = input.split(" ");
        StringBuffer sb= new StringBuffer(input);
        sb.reverse();
        for(int i=0 ; i<input.length(); i++){
        if(input.charAt(i)== ' '){
           sb.insert(i, " ");
        }
     }
     sb.append("");
     System.out.println(sb);
	}

}
