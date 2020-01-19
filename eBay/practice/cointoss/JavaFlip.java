package cointoss;

/*
 * Java Math.random() returns a random value between 0.0 and 1.0 each time.
If value is below 0.5 then it's Heads or otherwise Tails.
 */
public class JavaFlip {

	public static void main(String[] args) {
		if (Math.random() < 0.5){
			System.out.println("Heads");
		}else{
			System.out.println("Tails");
		}
	}
}
