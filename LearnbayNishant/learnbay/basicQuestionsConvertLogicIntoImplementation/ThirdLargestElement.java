package basicQuestionsConvertLogicIntoImplementation;

public class ThirdLargestElement {

	public static void main(String[] args) {
		
		// Process1
		 int numbers [] = new int[] {5,2,1,7,6,0,12,13,3};
		 for(int i=0;i<(numbers.length-1);i++) {
			
				 if(numbers[i] > numbers[i+1]) {
					 int temp = numbers[i];
					 numbers[i] = numbers[i+1];
					 numbers[i+1] = temp;
					 
				 }
				// System.out.println("numbers[j]"+numbers[j]);
			
			// System.out.print("numbers[i]"+numbers[i]);
		 }
		 
		// Process2
		 
		 /* There should be atleast three elements */
		 if(numbers.length < 3)
		 { 
		        System.out.printf(" Invalid Input "); 
		        return; 
		 } 
		 
		// Find first largest element 
		 int first = numbers[0];
		 for(int i=0;i<numbers.length;i++) {
			 if(numbers[i]>first)
				 first = numbers[i];
		 }
		 
		// Find second  
		    // largest element
		 int second = Integer.MIN_VALUE; 
		    for (int i = 0;  
		             i < numbers.length ; i++) 
		        if (numbers[i] > second &&  
		        		numbers[i] < first) 
		            second = numbers[i]; 
		    
		 // Find third 
		    // largest element 
		    int third = Integer.MIN_VALUE; 
		    for (int i = 0;  
		             i < numbers.length ; i++) 
		        if (numbers[i] > third &&  
		        		numbers[i] < second) 
		            third = numbers[i]; 
		  
		    System.out.printf("The third Largest " +  
		                  "element is %d\n", third); 
		    
		    //Process3
		    
		    int temp;  
		    int thirdone=0;
		    for (int i = 0; i < numbers.length; i++)   
		            {  
		                for (int j = i + 1; j < numbers.length; j++)   
		                {  
		                    if (numbers[i] > numbers[j])   
		                    {  
		                        temp = numbers[i];  
		                        numbers[i] = numbers[j];  
		                        numbers[j] = temp;  
		                        thirdone = numbers[i];
		                       // System.out.printf("The third Largest " +"element is %d\n", thirdone);
		                    }  
		                }  
		                //System.out.printf("The third Largest " +"element is %d\n", thirdone);
		            }  
		  System.out.printf("The third Largest  %d\n", thirdone);
		    
	}

}
