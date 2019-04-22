package basicQuestionsConvertLogicIntoImplementation;

public class PrintLeftElement {
	//Rotating to the left by n is the same as rotating to the right by length-n.

	public static void main(String[] args) {
		 int arr[] = {1, 3, 5, 7, 9}; 
	        int k=2; 
	        preprocess(arr,k);
	        
	}

	private static void preprocess(int[] arr, int order) {

//Rotate right (for positive n):
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			result[(i + order) % arr.length] = arr[i];
			 System.out.print(result[i]);
		}
        System.out.print(result);
        
        //Rotate left (for positive n):
        for(int i = 0; i < arr.length; i++){
            result[(i+(arr.length-order)) % arr.length ] = arr[i];
        }
	} 

}


