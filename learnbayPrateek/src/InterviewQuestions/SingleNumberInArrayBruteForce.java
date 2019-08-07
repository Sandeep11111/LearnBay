package InterviewQuestions;

// given array of integers, every element appears twice except for one.Find that single one
//n2
public class SingleNumberInArrayBruteForce {

	
	public static void main(String args[]) 
    { 
        int arr[] = {1,5,6,2,1,6,4,3,2,5,3}; 
        int n = arr.length; 
        getSingle(arr, n); 
    }

	private static void getSingle(int[] a, int n) {
		 boolean [] visited = new boolean[a.length];
	        for (int i = 0; i <a.length ; i++) {
	            int x = a[i];
	            if(visited[i]==false) {
	                boolean isDuplicate = false;
	                for (int j = i + 1; j < a.length; j++) {
	                    if (x == a[j]) {
	                        isDuplicate = true;
	                        visited[j] = true;
	                    }
	                }
	                if (!isDuplicate)
	                    System.out.println("Element appear only once in array - " + x);
	            }
	        }
	} 
}
