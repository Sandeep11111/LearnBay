package checkTwoStringAnagram;

import java.util.Arrays;

public class CheckTwoStringAnagram {

	public static void main(String[] args) {
		String str1 = "keep";
	      String str2 = "peek";

	      if (str1.length()==str2.length()) {
	         char[] arr1 = str1.toLowerCase().toCharArray();
	         Arrays.sort(arr1);
	         System.out.println(Arrays.toString(arr1));
	         char[] arr2 = str2.toLowerCase().toCharArray();
	         Arrays.sort(arr2);
	         System.out.println(Arrays.toString(arr2));
	         System.out.println(Arrays.equals(arr1, arr2));
	         boolean status = Arrays.equals(arr1, arr2);
	         System.out.println(arr1);
	         System.out.println(arr2);
	         if(status) {
	            System.out.println("Given strings are anagrams");
	         } else {
	            System.out.println("Given strings are not anagrams");
	         }
	      }
	}
}
