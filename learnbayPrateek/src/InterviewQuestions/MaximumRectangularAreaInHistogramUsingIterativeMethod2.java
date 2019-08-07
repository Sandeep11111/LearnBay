package InterviewQuestions;

import java.util.Scanner;

//https://aaronice.gitbooks.io/lintcode/data_structure/largest_rectangle_in_histogram.html
public class MaximumRectangularAreaInHistogramUsingIterativeMethod2 {

	public static void main(String[] args) {
		 
		Scanner scn = new Scanner(System.in);
		/*input number of bars in the histogram*/	
		int n = scn.nextInt();
			long[] a = new long[n];
			/*input height of each bar*/
			for (int i = 0; i < a.length; i++) {
				a[i] = scn.nextLong();
			}
 
			System.out.println(largestRectangleArea(a));
	}
	
	public static long largestRectangleArea(long[] height) {
        long maxArea = 0;
        long[] min = new long[height.length];
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                if (i == j) {
                    min[j] = height[j];
                } else {
                    if (height[j] < min[j - 1]) {
                        min[j] = height[j];
                    } else {
                        min[j] = min[j - 1];
                    }
                }
                long tempArea = min[j] * (j - i + 1);
                if (tempArea > maxArea) {
                    maxArea = tempArea;
                }
            }
        }

        return maxArea;
    }
}
