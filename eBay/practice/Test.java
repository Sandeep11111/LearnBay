import java.util.ArrayList;
import java.util.List;

public class Test {
// Naive function to find maximum difference between two elements in
		// the array such that smaller element appears before the larger
		// element in the array
		public static int diff(List<Integer> A)
		{
			if(A.size() == 0)
				return -1;
			
			int diff = Integer.MIN_VALUE;

			for (int i = 0; i < A.size() - 1; i++) {
				for (int j = i + 1; j < A.size(); j++) {
					diff = Integer.max(diff, A.get(j)-A.get(i));
				}
			}

			return diff;
		}

		// main function
		public static void main(String[] args)
		{
			List<Integer> arl = new ArrayList<Integer>();
			arl.add(5);
			arl.add(10);
			arl.add(8);
			arl.add(7);
			arl.add(6);
			arl.add(5);
			arl.add(-1);
//			arl.add(2);
//			arl.add(7);
//			arl.add(9);
//			arl.add(5);
//			arl.add(1);
			

			System.out.print("The maximum difference is " + diff(arl));
		}
	

}
