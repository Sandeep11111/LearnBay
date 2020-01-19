package leetCode;

public class HouseRobber_198 {

	public static int rob(int[] nums) {
		int a=0,b=0;
		for(int i=0;i<nums.length;i++) {
			//check for odd condition
			if(i%2==1) {
				a=Math.max(a+nums[i], b);
			}
			//check for even condition
			else {
				b=Math.max(b+nums[i], a);
			}
		}
		
		return Math.max(a, b);
	}
	
	public static void main(String[] args) {
		int[] arr = {4,7,9,2,3,9};
         System.out.println(rob(arr));
	}

}
