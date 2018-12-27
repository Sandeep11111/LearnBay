package array;

/*
 * given an array replace every element by greater element on right side
(not including the element)

I/p: 16 17 4 3 5 2
O/P: 17 5  5 5 2 -1
 */

public class ReplaceEveryElementByGreaterElementOnRightSide {

	public static void main(String[] args) {
		
		int array [] = new int[] {16,17,4,3,5,2};
		
		// brute force
		int size = array.length;
        int max_from_right_num =  array[size-1];
        array[size-1] = -1;
 
        for (int i = size-2; i >= 0; i--)
        {
            int temp = array[i];
            array[i] = max_from_right_num;
            if(max_from_right_num < temp)
            max_from_right_num = temp;
        }
        
		for (int i=0; i<array.length; ++i) 
            System.out.print(array[i] + " "); 
        //System.out.println(); 
		
		int array1 [] = new int[] {16,17,4,3,5,2};
		int size1 = array1.length;
        // replace(array1, size1);
	}
	
	
// t.c = ns
	private static void replace(int a[], int n ){

		   int max = a[n-1];
		   a[n-1] = -1;

		   for(int i =n-2;i>0;i--)
		   {
		      int temp = a[i];

		      if(max>a[i+1])
		         a[i]=max;
		      else
		          a[i] = a[i+1];

		      if(max<temp)
		          max=temp;
		      
		      System.out.print("--"+a[i]);
		   }
		   
		}

}
