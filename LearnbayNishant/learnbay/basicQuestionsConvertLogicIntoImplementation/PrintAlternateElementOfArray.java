package basicQuestionsConvertLogicIntoImplementation;

public class PrintAlternateElementOfArray {

	public static void main(String[] args) {
		
		//Integers
		int[] integerArray = new int[10];
		int a[]={1,2,5,6,3,2}; 
		
		for(int i=0;i<integerArray.length;i+=2) {
			System.out.println("i"+i);
			
		}
		
		for(int j=0;j<a.length;j+=2) {
			System.out.println("integerArray"+a[j]);
		}
		
		for(int k=0;k<a.length;k++) {
			if(a[k]%2 == 0) {
			System.out.println("integerArray of even"+a[k]);
			}else if(a[k]%2!= 0) {
			System.out.println("integerArray of odd"+a[k]);
			}
		}
		
		//String
		String sample = "sandeep";
		char [] charArray = sample.toCharArray();
		for(int i=0;i<charArray.length;i+=2) {
			System.out.println("sample"+charArray[i]);
		}
		
		String str[] = new String[] { "Welcome" };
		for (int i = 0; i < str.length; i += 2) {
		        char c = str[0].charAt(i);
		        System.out.println(c);
		}
	}
}
