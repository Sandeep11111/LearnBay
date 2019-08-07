package InterviewQuestions;

//https://www.programcreek.com/2014/06/leetcode-trapping-rain-water-java/
public class TrappingRainWaterBruteForce1 {

	public static void main(String[] args) {
		int[] heights = {1,0,2,2,4,0,1,5,2,1,3,1};
		System.out.println(trap(heights));
	}
	
	public static int trap(int[] height) {
	    int result = 0;
	 
	    if(height==null || height.length<=2)
	        return result;
	 
	    int left[] = new int[height.length];
	    int right[]= new int[height.length];
	 
	    //scan from left to right
	    int max = height[0];
	    left[0] = height[0];
	    for(int i=1; i<height.length; i++){
	        if(height[i]<max){
	            left[i]=max;
	        }else{
	            left[i]=height[i];
	            max = height[i];
	        }
	    }
	 
	    //scan from right to left
	    max = height[height.length-1];
	    right[height.length-1]=height[height.length-1];
	    for(int i=height.length-2; i>=0; i--){
	        if(height[i]<max){
	            right[i]=max;
	        }else{
	            right[i]=height[i];
	            max = height[i];
	        }
	    }
	 
	    //calculate totoal
	    for(int i=0; i<height.length; i++){
	        result+= Math.min(left[i],right[i])-height[i];
	    }
	 
	    return result;
	}
}
