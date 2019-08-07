

public class LengthOfArrayWithoutLengthMethod {

	public static void main(String[] args) {
		int count = 0;
	    int[] someArray = new int[5];  
	    int temp = 0;
	    try
	    {
	        while(true)
	        {
	            temp = someArray[count];
	            count++;
	        }
	    }
	    catch(Exception ex)
	    {
	           System.out.println(count); 
	    }
	}

}


