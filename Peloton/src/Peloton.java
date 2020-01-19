/*
 * Given a string as an input, convert to a String following this format:
 "[first letter][number of letters in between][last letter]
 peloton -> p5n
 boy, bay -> b1y
 it -> i0t
  i -> i0i
 */
public class Peloton {

	public static void main(String[] args) {

		//String str = "peloton"; 
		//String str = "boy"; 
		String str = ""; 
		convert(str); 
	}

	private static void convert(String str) {
		String s1 = ""; 
		String s2 = "";
		
		char[] ch = str.toCharArray();
		int count=ch.length;
		for(int i=0; i<ch.length;i++) {

			// Declare an String with empty initialization 
		
			//first letter
			if(i == 0) {
				s1 = s1+ch[i];
				count = count-1;
			}

			//number of letter in between //last letter
			if(i == str.length()-1) {
				s2 = s2+ch[i];
				count = count-1;
			}


		}
		if(count < 0) {
			count=0;
		}
		System.out.print(s1+count+s2);
	}

}
