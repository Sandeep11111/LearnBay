// wherever there is Functional interface use lamda expression
interface Interf1
{
	public int squareIt(int n);
}

public class FunctionalInterfaceWithLambda {

	public static void main(String[] args) {
         Interf1 i = n->n*n;
		
		System.out.println(i.squareIt(5));
		System.out.println(i.squareIt(4));

	}

}
