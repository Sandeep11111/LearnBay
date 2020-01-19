package warmUpQuestions;

import java.util.Arrays;

// Given an array, rearrange the elements of array in zigzag fashion.

/*
 *  i/p: 4 3 7 8 6 2 1
 *  o/p: 3 7 4 8 2 6 1
 *  
 *  a1 < a2 > a3 < a4 > a5
 */

public class ArrayZigZagFashion {

	public static void main(String[] args) {
		 int inputArr[] = new int[]{4, 3, 7, 8, 6, 2, 1};
		 
		 //zigZagUsingSorting(inputArr);// t.c nlogn becoz of sorting
		 zigZagUsingFlag(inputArr);// t.c n  
		 zigZagUsingModulusAndFlag(inputArr);// t.c n  
	}

	private static void zigZagUsingModulusAndFlag(int[] inputArr) {
		for(int i=0; i<inputArr.length-1;i++) {
			if(i%2==0) { //a<b
				if(inputArr[i]>inputArr[i+1]) {
					//swap(inputArr[i],inputArr[i+1]);
				}else { //a>b
					if(inputArr[i]<inputArr[i+1]) {
						//swap(inputArr[i],inputArr[i+1]);
					}
				}
			}
		}
		
	}

//	private static void swap(int i, int j) {
//		int temp =0; 
//		// swap 
//        temp  = arr[i]; 
//        arr[i] = arr[j]; 
//        arr[j] = temp; 
//		
//	}

	private static void zigZagUsingFlag(int[] arr) {
		 // Flag true indicates relation "<" is expected, 
        // else ">" is expected.  The first expected relation 
        // is "<" 
        boolean flag = true; 
        int temp =0; 
       
        for (int i=0; i<=arr.length-2; i++) 
        { 
            if (flag)  /* "<" relation expected */
            { 
                /* If we have a situation like A > B > C, 
                   we get A > B < C by swapping B and C */
                if (arr[i] > arr[i+1]) 
                { 
                    // swap 
                    temp  = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                }  
            } 
            else /* ">" relation expected */
            { 
                /* If we have a situation like A < B < C, 
                   we get A < C > B by swapping B and C */
                if (arr[i] < arr[i+1]) 
                { 
                    // swap 
                    temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                } 
            } 
            flag = !flag; /* flip flag */
        } 
        StringBuilder str = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			str.append(arr[i]).append(' ');
		}
		System.out.print(str);
	}

	private static void zigZagUsingSorting(int[] inputArr) {
		//Sort the array 
	      Arrays.sort(inputArr);
	      System.out.println(Arrays.toString(inputArr));
	      
	    //Swap elements in pair skipping first element
			for(int i=1;i<inputArr.length-1;i+=2) {
				int temp = inputArr[i];
				inputArr[i]=inputArr[i+1];
				inputArr[i+1]=temp;
			}
			
			StringBuilder str = new StringBuilder();
			for(int i=0;i<inputArr.length;i++) {
				str.append(inputArr[i]).append(' ');
			}
			System.out.print(str);
	}
}
