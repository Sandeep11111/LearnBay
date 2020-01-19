package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteAndEarn_740 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] nums = {2, 2, 3, 3, 3, 4};
		List nums = new ArrayList();
		nums.add(2);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		System.out.println(maxPoints(nums));
	}
	
	public static long maxPoints(List<Integer> elements) {
	    if (elements.size() == 0) {
	        return 0;
	    }

	    if (elements.size() == 1) {
	        return elements.get(0);
	    }

	    int bins[] = new int[10001];
	    int sum[] = new int[10001];
	    int maxVal = 0;

	    for (int n : elements) {
	        bins[n]++;
	        if (n > maxVal) {
	            maxVal = n;
	        }
	    }

	    sum[0] = bins[0];
	    sum[1] = bins[1];

	    for (int i = 2; i <= maxVal; i++) {
	        sum[i] = Math.max(sum[i - 2] + bins[i] * i, sum[i - 1]);
	    }

	    return sum[maxVal];
	}

}
