package basicQuestionsConvertLogicIntoImplementation;

public class PollindromicArray {

	public static void main(String[] args) {
		
		// String
		String sample = "abcdcba";
		char [] charArray = sample.toCharArray();
		int i=0,j=((charArray.length)-1);

		while(i<j) {
			if(charArray[i] == charArray[j]) {
				i++;
				j--;
				System.out.println("Pollindrom");
			}else {
				System.out.println("Not--Pollindrom");
			}
		}
		
		//Integer
		
		//array of numbers to be checked
		int numbers[] = new int[]{121,13,34,11,22,54};
		
		//iterate through the numbers
				for(int k=0; k < numbers.length; k++){
					
					int number = numbers[k];
					int reversedNumber  = 0;
					int temp=0;
					
					/*
					 * If the number is equal to it's reversed number, then
					 * the given number is a palindrome number.
					 * 
					 * For example, 121 is a palindrome number while 12 is not.
					 */
					
					//reverse the number
					while(number > 0){
						temp = number % 10;
						number = number / 10;
						reversedNumber = reversedNumber * 10 + temp;
					}
					
					if(numbers[k] == reversedNumber)
						System.out.println(numbers[k] + " is a palindrome number");
					else 
						System.out.println(numbers[k] + " is not a palindrome number");
					
				}
	}

}
