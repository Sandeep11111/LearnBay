package singleLinkedList;

import java.util.LinkedList;
import java.util.List;

//https://crunchify.com/java-how-to-find-middle-element-of-linkedlist/
/*
 * One of the algo for this would be:

Traverse the list and find the length of list
After finding length, again traverse the list and locate n/2 element from head of linkedlist.
Time complexity=time for finding length of list + time for locating middle element=o(n)+o(n) =o(n)
Space complexity= o(1).
 */

public class FindMiddleInLinkedList {
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 99; i++) {
			list.add(String.valueOf(i));
		}
 
		System.out.println("Middle Element of Linked List is: " + FindMiddle1(list));
	}
 
	private static String FindMiddle1(List<String> list) {
		int size = list.size();
		int middle = (size / 2);
		return list.get(middle).toString();
	}

}
