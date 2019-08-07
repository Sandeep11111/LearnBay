package predicate;
import java.util.function.*;

public class TestEvenNumberAndGreaterThan10WithPredicateAndLambdaExpression {

	public static void main(String[] args) {
		int[] x = {0,5,10,20,30,40,50,70};
		Predicate<Integer> p1 = x1->x1>10;
		Predicate<Integer> p2 = x1->x1%2==0;
       // m1(p1,x);
       // m1(p2,x);
      //  m1(p1.and(p2),x);
        m1(p1.negate(),x);
	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
}
