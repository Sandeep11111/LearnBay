// Given an sorted 2d array having 0's and 1's 
//find the row number which has maxi,um 1's

package array;

public class NumberOfRowsWhichHasMaximum1s {

	public static void main(String[] args) {
		
		int[][] array = new int[][]{{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
		int[][] array1 = new int[][]{{0,0,0,0},{0,0,0,1},{0,1,1,1},{1,1,1,1}};
		
		//Brute Force
		System.out.println(new NumberOfRowsWhichHasMaximum1s().compute(array));
		
		//process 2
		/* Efficient Approach : Start with top left corner with index (1, n) and try to go left until you reach last 1 in that row (jth column), now if we traverse left to that row, we will find 0, so switch to the row just below, with same column. Now your position will be (2, j) again in 2nd row if jth element if 1 try to go left until you find last 1 otherwise in 2nd row if jth element is 0 go to next row. So Finally say if you are at any ith row and jth column which is index of last 1 from right in that row, increment i. So now if we have Aij = 0 again increment i otherwise keep decreasing j until you find last 1 in that particular row.
		 * */
		 
		System.out.println(new NumberOfRowsWhichHasMaximum1s().compute2(array1));
	}

	private int compute(int[][] array) {
		
		int maxRowOnesIndex = 0;
        int maxRowOnesCount = 0;
        
        for(int i=0;i<array.length;i++) {
        	int localMaxOnesCount = 0;
        	
        	for(int j=0;j<array[i].length;j++) {
        		if(array[i][j] ==1) {
        		}
        	}
        	if(localMaxOnesCount > maxRowOnesCount)
            {
                maxRowOnesCount = localMaxOnesCount;
                maxRowOnesIndex = i;
            }
        }
		return maxRowOnesIndex;
	}
	
	private int compute2(int[][] array) {
		 int N = array.length-1; 
		 int row = 0, i, j; 
		  
	        for (i = 0, j = N - 1; i < N; i++) { 
	              
	            // find left most position of 1 in 
	            // a row find 1st zero in a row 
	            while (array[i][j] == 1 && j >= 0) { 
	                  
	                row = i; 
	                j--; 
	            } 
	        } 
	          
	        System.out.print("Row number = " 
	                                + (row + 1)); 
	        System.out.print(", MaxCount = " 
	                               + (N - 1 - j)); 
	        return row;
	}       
}
