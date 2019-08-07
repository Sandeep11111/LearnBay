package interviewquestions;

public class FizzBuzz {
	
	public static String fizzBuzz(int number) { 
		if (number % 3 == 0) { 
			if (number % 5 == 0) { 
				return "fizzbuzz"; 
				} 
			else { 
				return "fizz"; 
				} 
			} else if (number % 5 == 0) { 
				return "buzz"; 
				} 
		return String.valueOf(number); }

	

	public static void main(String[] args) {
		String result = FizzBuzz.fizzBuzz(15);
        System.out.println(result);
	}

}
