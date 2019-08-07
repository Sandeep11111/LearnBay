package predicate;
import java.util.function.*;


public class TestEvenNumberWithPredicateAndLambdaExpression {

	public static void main(String []arg) {
		Predicate<Integer> isEven = i->i%2==0;
		System.out.println(isEven.test(8));
	}
}

//public boolean test() {
//	if(x%2==0) {
//		return true;
//	}
//	else {
//		return false;
//	}
//}