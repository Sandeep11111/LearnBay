package cointoss;

import java.util.Random;

/*
 *  Let's say we have a function findProbabilityofCoinToss(), this predicts the toss with a probability
 *  of an event with a 40% and 60% accuracy, such as 40% head and 60% time tails.
 *  So how can we write another method over this to manipulate the frequency to be 50% for each occurrence.
 * 
 */
public class FindProbabilityofCoinToss {

	public static void main(String[] args) {
		makeProbEqual();

	}
	
	private static String makeProbEqual() {
		;
		String x;
		String y;
		do {
		x = findProbabilityofCoinToss();
		y = findProbabilityofCoinToss();
		
		if(x==y) 
			continue;
			return x;
		} while(x!=y);
		return "";
	}

	private static String findProbabilityofCoinToss() {
		// TODO Auto-generated method stub
		 return "";
	}

}
