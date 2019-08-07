// wherever there is Functional interface use lamda expression
interface Interf
{
	public int squareIt(int n);
}

public class FunctionalInterfaceWithoutLambda implements Interf{

	@Override
	public int squareIt(int n) {
		return n*n;
	}

	public static void main(String[] args) {
		
		FunctionalInterfaceWithoutLambda demo = new FunctionalInterfaceWithoutLambda();
		
		System.out.println(demo.squareIt(5));
		System.out.println(demo.squareIt(4));
	}
}
