package predicate;

public class TestGreaterThanWithoutPredicateAndLambdaExpression {

	public boolean test(int x) {
		if (x > 10) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		TestGreaterThanWithoutPredicateAndLambdaExpression test = new TestGreaterThanWithoutPredicateAndLambdaExpression();
		System.out.println(test.test(5));
	}
}
