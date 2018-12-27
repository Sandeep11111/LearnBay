package countNumberOfWordsInString;

import java.util.StringTokenizer;

public class CountNumberOfWordsInString {
	
	public static void main(String arg[]) {
		String string = "aaa ssss w ccc  ";
		int wordLength = wordLength(string);
		System.out.println("wordLength"+wordLength);
	}
	
//	static int wordLength(String words) {
//		if(words == null && words.isEmpty()) {
//			return 0;
//		}
//			String[] word = words.split("\\s+");
//		    return word.length;
//	}
	
	public static int wordLength(String sentence){
	
		if (sentence == null || sentence.isEmpty()) { 
	
		return 0; 
		} 
	StringTokenizer tokens = new StringTokenizer(sentence); 
	return tokens.countTokens(); 
	}
	
	
	
	
}
