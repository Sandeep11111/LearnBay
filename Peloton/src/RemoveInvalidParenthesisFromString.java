import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//https://www.techiedelight.com/generate-permutations-string-java-recursive-iterative/
// https://www.programcreek.com/2013/02/leetcode-permutations-java/
public class RemoveInvalidParenthesisFromString {

	// method checks if character is parenthesis(open 
	// or closed) 
	static boolean isParenthesis(char c) 
	{ 
	    return ((c == '(') || (c == ')')); 
	}
	
	// method returns true if string contains valid 
	// parenthesis 
	static boolean isValidString(String str) 
	{ 
	    int cnt = 0; 
	    for (int i = 0; i < str.length(); i++) 
	    { 
	        if (str.charAt(i) == '(') 
	            cnt++; 
	        else if (str.charAt(i) == ')') 
	            cnt--; 
	        if (cnt < 0) 
	            return false; 
	    } 
	    return (cnt == 0); 
	} 
	
	// method to remove invalid parenthesis 
	static void removeInvalidParenthesis(String str) 
	{ 
	    if (str.isEmpty()) 
	        return; 
	  
	    // visit set to ignore already visited string 
	    HashSet<String> visit = new HashSet<String>(); 
	  
	    // queue to maintain BFS 
	    Queue<String> q = new LinkedList<>(); 
	    String temp; 
	    boolean level = false; 
	  
	    // pushing given string as  
	    // starting node into queue 
	    q.add(str); 
	    visit.add(str); 
	    while (!q.isEmpty()) 
	    { 
	        str = q.peek(); q.remove(); 
	        if (isValidString(str)) 
	        { 
	            System.out.println(str); 
	  
	            // If answer is found, make level true 
	            // so that valid string of only that level 
	            // are processed. 
	            level = true; 
	        } 
	        if (level) 
	            continue; 
	        for (int i = 0; i < str.length(); i++) 
	        { 
	            if (!isParenthesis(str.charAt(i))) 
	                continue; 
	  
	            // Removing parenthesis from str and 
	            // pushing into queue,if not visited already 
	            temp = str.substring(0, i) + str.substring(i + 1); 
	            System.out.println("temp"+temp);
	            if (!visit.contains(temp)) 
	            { 
	                q.add(temp); 
	                visit.add(temp); 
	            } 
	        } 
	    } 
	} 
	
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		//start from an empty list
		result.add(new ArrayList<Integer>());
	 
		for (int i = 0; i < num.length; i++) {
			//list of list in current iteration of the array num
			ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
	 
			for (ArrayList<Integer> l : result) {
				// # of locations to insert is largest index + 1
				for (int j = 0; j < l.size()+1; j++) {
					// + add num[i] to different locations
					l.add(j, num[i]);
	 
					ArrayList<Integer> temp = new ArrayList<Integer>(l);
					current.add(temp);
	 
					//System.out.println(temp);
	 
					// - remove num[i] add
					l.remove(j);
				}
			}
	 
			result = new ArrayList<ArrayList<Integer>>(current);
		}
	 
		return result;
	}
	
	public static void main(String[] args) {
		//String expression = "()())()"; 
	    //removeInvalidParenthesis(expression); 
	  
	   String  expression = "()v)"; 
	    removeInvalidParenthesis(expression); 
	   //permute(expression);

	}

}
