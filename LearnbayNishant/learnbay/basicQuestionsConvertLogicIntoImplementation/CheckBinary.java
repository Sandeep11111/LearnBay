package basicQuestionsConvertLogicIntoImplementation;

public class CheckBinary {

	public static void main(String[] args) {
		System.out.printf("Does number %d is a binary number? %b %n", 101, isBinary(101)); 
		System.out.printf("Does integer %d is a binary number? %b %n", 121, isBinary(121)); 
		System.out.printf("Does %d is a binary number? %b %n", 1011, isBinary(1011)); 
		System.out.printf("Does number %d is a binary number? %b %n", 111111, isBinary(111111)); 
		System.out.printf("Does %d is a binary number? %b %n", 1321, isBinary(1321)); 
		}

	//Process1
	public static boolean isBinary(int number) { 
		int copyOfInput = number; 
		while (copyOfInput != 0) { 
			if (copyOfInput % 10 > 1) { 
				return false; 
				} 
			copyOfInput = copyOfInput / 10; 
			} 
		return true; 
		}

}
