/**
 * 
 */
package stack;

import java.util.Arrays;

/**
 * @author sandeepkumarsingh
 * leet code 48
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * 
 *https://codepumpkin.com/trapping-rain-water-algorithm-problem/
 */
public class TrappingRainWater {

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		trappingWater_bruteForce(arr);  //time complexity = n*n
		//trappingWater_preComputing(arr);  //time complexity = n
	}

	private static int trappingWater_preComputing(int[] arr) {
		int left = 0, right = arr.length-1;
        int maxleft = 0, maxright = 0;
        int result = 0;
        while(left <= right){
            if(arr[left] < arr[right]){
                if(arr[left]>=maxleft) maxleft = arr[left];
                else result += maxleft - arr[left];
                left++;
            }
            else{
                if(arr[right]>=maxright) maxright = arr[right];
                else result+=maxright-arr[right];
                right--;
            }
        }
        return result;
		
	}

	private static int trappingWater_bruteForce(int[] arr) {
		int result = 0;
		int leftBar = 0;
		int rightBar = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			// left bar
			for(int j=i;j<i;j--) {
				if(arr[j]>leftBar) {
					leftBar = arr[j];
				}
			}
			// right bar
			for(int k=i;k<arr.length;k++) {
				if(arr[k]>rightBar) {
					rightBar = arr[k];
				}
			}
			//update the maximum water, find the minimum from left and right bar and subtract current bar
			result = result+(Math.min(leftBar,rightBar)-arr[i]);
		}
		System.out.println("--result"+(result));
		return result;
	}
}
