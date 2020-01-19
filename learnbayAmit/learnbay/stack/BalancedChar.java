package stack;

import java.util.Stack;

public class BalancedChar {

	public static void main(String[] args) {
		System.out.println(isBalanced("({})"));

	}
	
	public static String isBalanced(String s) {
		Stack st = new Stack();
		boolean isBalance = false;
		
		if(s.length()%2 != 0) {
			return "NO";
		}else {
			for(int i=0;i<s.length();i++) {
				char inChar = s.charAt(i);
				if(inChar == '(' || inChar == '{' || inChar == '[') {
					st.push(inChar);
				}else {
					isBalance = compareChar(inChar, (char) st.pop());
					if(!isBalance) {
						break;
					}else {
						return "Yes";
					}
				}
			}
		}
		
		return "NO";
	}
	
	public static boolean compareChar(char outChar, char inChar) {
	
		if(inChar == '(' && outChar == ')') {
			return true;
		} else if(inChar == '{' && outChar == '}') {
			return true;
		}
		else if(inChar == '[' && outChar == ']') {
			return true;
		}
		return false;
	}

}
