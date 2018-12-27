package basicQuestionsConvertLogicIntoImplementation;

public class SmallestElement {

	public static void main(String[] args) {
		int numbers[] = new int[] {2,1,1,1,1,1,4,6,8,8,6,9};
        int smallestNumber = numbers[0];
        int countOfSmallestNumber = 0;
        
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]<smallestNumber) {
        		smallestNumber = numbers[i];
        	}
        	if(numbers[i] == smallestNumber) {
        		countOfSmallestNumber++;
        	}
        }
        System.out.println("smallestNumber"+smallestNumber);
        System.out.println("countOfSmallestNumber"+(countOfSmallestNumber-1));
	}

}
