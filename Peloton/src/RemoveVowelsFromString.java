
public class RemoveVowelsFromString {

	public static void main(String[] args) {
		String s = removeVowels("leetcodeisacommunityforcoders");
		System.out.println(s);

	}
	
public static String removeVowels(String str) {
	//return str = str.replaceAll("[AaEeIiOoUu]", "");
	String vowel = "";
	  char[] ch = str.toCharArray();
	  for(int i=0;i<ch.length;i++) {
		  if(ch[i]!= 'a'|ch[i]!= 'e'|ch[i]!= 'i'|ch[i]!= 'o'|ch[i]!= 'u') {
			   vowel+= ch[i];
		  }
		  
	  }
	  return vowel;
    }

}
