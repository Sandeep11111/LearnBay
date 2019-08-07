package InterviewQuestions;

//https://letstalkalgorithms.com/trapping-rain-water-solution-java/
//https://codepumpkin.com/trapping-rain-water-algorithm-problem/
public class TrappingRainWaterBruteForce {

	public static void main(String[] args) {
		int[] heights = {1,0,2,2,4,0,1,5,2,1,3,1};
		System.out.println(bruteForce(heights));
	}
	
	public static int bruteForce(int[] heights){
		int result = 0, maxleft = 0, maxright = 0;
		int size = heights.length;
		for(int i=1;i<size-1;i++){
			maxleft = 0; maxright = 0;
			for(int j=i;j>=0;j--){
				maxleft = Math.max(maxleft, heights[j]);
			}
			for(int j=i;j<size-1;j++){
				maxright = Math.max(maxright, heights[j]);
			}
			result += Math.min(maxleft, maxright) - heights[i];
		}
		
		return result;
	}
}
