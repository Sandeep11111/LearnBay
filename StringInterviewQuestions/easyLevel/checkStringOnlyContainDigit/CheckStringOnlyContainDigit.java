package checkStringOnlyContainDigit;

public class CheckStringOnlyContainDigit {

	public static void main(String[] args) {
		String str1 = "1234a6789";
	    String str2 = "123456789";
	 
	    //Using Regular Expressions
	    System.out.println(str1 + ":" + str1.matches("[0-9]+"));
	    System.out.println(str2 + ":" + str2.matches("[0-9]+"));

	    //without Inbuilt functions
	    System.out.println(containsOnlyNumbers("123456"));
	    System.out.println(containsOnlyNumbers("123abc456"));
	}
	
	 public static boolean containsOnlyNumbers(String str) {
		    for (int i = 0; i < str.length(); i++) {
		        if (!Character.isDigit(str.charAt(i)))
		          return false;
		      }
		      return true;
		}
}
