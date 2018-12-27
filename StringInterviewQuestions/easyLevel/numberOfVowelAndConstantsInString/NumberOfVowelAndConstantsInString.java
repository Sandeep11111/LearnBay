package numberOfVowelAndConstantsInString;

public class NumberOfVowelAndConstantsInString {

	public static void main(String[] args) {
		
		String string = "awnemiokknu";
		
		int vowelCount=0;
		int constantCount=0;
		
		char[] charArray = string.toCharArray();

		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u') {
				vowelCount++;
			}else {
				constantCount++;
			}
		}
		System.out.println("vowelCount--"+vowelCount+"---constantCount--"+constantCount);
	}

}
