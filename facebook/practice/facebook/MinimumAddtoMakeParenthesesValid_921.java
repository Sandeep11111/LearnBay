package facebook;

public class MinimumAddtoMakeParenthesesValid_921 {

	public int minAddToMakeValid(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int openCursor = 0;
		int count = 0;

		for (char c : s.toCharArray()) {
			if (c == '(') {
				openCursor++;
			} else if (--openCursor < 0) {
				openCursor++;
				count++;
			}
		}

		return count + openCursor;

	}

	public static void main(String[] args) {
		MinimumAddtoMakeParenthesesValid_921 minString = new MinimumAddtoMakeParenthesesValid_921();
		System.out.println(minString.minAddToMakeValid("((("));
	}
}
