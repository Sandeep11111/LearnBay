package methodAndConstructorReferencesByUsingDoubleColonOperator;

interface Interf{
	public void m1();
}
public class MethodReferenceWithFunctionalInterface {

	public void m2() {
		System.out.println("Method Reference");
	}
	public static void main(String[] args) {
		Interf i=()->System.out.println("By Lambda expression");
        i.m1();
        
        MethodReferenceWithFunctionalInterface test = new MethodReferenceWithFunctionalInterface();
        Interf i1 = test::m2;
        i1.m1();
	}

}
