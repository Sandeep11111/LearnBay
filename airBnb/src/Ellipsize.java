
public class Ellipsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ellipsize("aaaaaa", 5));
	}
	
	static String ellipsize(String input, int maxLength) {
	    String ellip = "...";
	    if (input == null || input.length() <= maxLength 
	           || input.length() < ellip.length()) {
	        return input;
	    }
	    return input.substring(0, maxLength - ellip.length()).concat(ellip);
	}

}
