package wordPattern;
/*
 * https://github.com/shua2018ti/airbnb-interview-problems
 * https://github.com/allaboutjst/airbnb
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.


 * 
 */
public class WordPattern1 {
	
	public static void main(String[] args) 
    { 
		WordPattern1 wd1 = new WordPattern1();
		boolean bb = wd1.wordPattern("abba", "dog cat cat dog");
    } 
	
	public boolean wordPattern(String pattern, String str) {
	
		if(pattern.isBlank() || pattern.isEmpty() || pattern == null || str.isBlank() || str.isEmpty() || str == null) {
			return false;
		}
		
		Map<Character, String> lookup = new HashMap<Character,String>();
		
		String[] strs = str.split(" ");
		
		if(strs.length!=pattern.length()) {
			return false;
		}
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0;i<pattern.length();i++) {
			char c = pattern.charAt(i);
			
			if(lookup.containsKey(c)) {
				if(!lookup.get(c).equals(strs[i])) {
					return false;
				}
			}
			else {
				if(set.contains(strs[i])) {
					return false;
				}
				lookup.put(c, strs[i]);
				set.add(strs[i]);
			}
		}
		return true;
	
	}

}
