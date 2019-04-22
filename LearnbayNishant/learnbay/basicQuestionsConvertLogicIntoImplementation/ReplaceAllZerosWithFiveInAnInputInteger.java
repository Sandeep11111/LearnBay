package basicQuestionsConvertLogicIntoImplementation;

public class ReplaceAllZerosWithFiveInAnInputInteger {

	public static void main(String[] args) {
		
		// Process1
		int numbers [] = new int[] {1,2,0,7,7,0,0,2};
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] == 0) {
				numbers[i]=5;
			}
			System.out.println("Process1"+numbers[i]);
		}
		
		// Process2
        int intNum = 10050;
        String abc = String.valueOf(intNum);
        String abcd =abc.replaceAll("0", "5");
        System.out.println("Process2"+(abcd));
        System.out.println("Process2"+Integer.parseInt(abcd));
        
        // Process3
        
	}

}
