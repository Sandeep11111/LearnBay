package reccursion;

/*
 *  n=2 => 2^2+1^1 = 5
 *  n=3 => 3^3+2^2+1^1 = 32
 * 
 */
public class CalculatePowerUsingRecursion {

	public static void main(String[] args) {
		Double value = calculatePowerUsingRecursion(3);
		System.out.println(value);

	}

	private static double calculatePowerUsingRecursion(int n) {
		if(n>0) {
			return Math.pow(n, n)+ calculatePowerUsingRecursion(n-1);
		}
		return 0.0;
	}

}
