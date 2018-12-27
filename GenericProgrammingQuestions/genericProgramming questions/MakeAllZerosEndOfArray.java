
public class MakeAllZerosEndOfArray {
	
	static void pushZerosToEnd(int arr[],int n) {
		int count =0; // Count of non-zero element
		// Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];// here count is 
                                      // incremented 
			}
		}
			// Now all non-zero elements have been shifted to 
	        // front and 'count' is set as index of first 0. 
	        // Make all elements 0 from count to end. 
			while (count < n) 
	            arr[count++] = 0; 
		
	}
	
	static void swap(int arr[],int n) {
		int count =0; // Count of non-zero element
		for(int i=0;i<n;i++) {
			for(int j=(n-i);j<n;j--) {
				if(arr[i]==0 && arr[j]!=0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
        int n = arr.length; 
       // pushZerosToEnd(arr, n);
        swap(arr, n);
        System.out.println("Array after pushing zeros to the back: "); 
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+" "); 
        }
	}

}
