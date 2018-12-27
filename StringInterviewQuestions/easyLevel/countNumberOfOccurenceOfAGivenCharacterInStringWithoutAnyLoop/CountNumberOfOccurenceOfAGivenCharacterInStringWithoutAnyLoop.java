package countNumberOfOccurenceOfAGivenCharacterInStringWithoutAnyLoop;

public class CountNumberOfOccurenceOfAGivenCharacterInStringWithoutAnyLoop {

	public static void main(String[] args) {
		
		String str= "geeksforgeeks"; 
        char c = 'e'; 
        System.out.println(count3(str, c)); 
	}
	//with loop
	public static int count(String str, char c) {
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	//without loop replace function
	public static int count1(String str, char c) {
		int count = 0;
		System.out.println("length ofstring"+str.length());
		System.out.println("length ofstring"+str.replace("e","").length());
		count = str.length() - str.replaceAll("e","").length();
		return count;
	}
	
	//using java 8
		public static int count2(String str, char c) {
			long count = 0;
		    count = str.chars().filter(ch -> ch == c).count();
			System.out.println("count = " + count);
			return Integer.parseInt(String.valueOf(count));
		}
		
		//using split
				public static int count3(String str, char c) {
					int count = 0;
					count = str.split("e",-1).length-1;
					System.out.println("count = " + count);
					return count;
				}
}
