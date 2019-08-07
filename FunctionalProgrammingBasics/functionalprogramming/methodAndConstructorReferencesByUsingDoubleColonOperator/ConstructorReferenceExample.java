package methodAndConstructorReferencesByUsingDoubleColonOperator;

interface Interf2
{
	public Sample1 m1();
}

class Sample1{
	
	Sample1(){
		System.out.println("Sample1 Constructor");
	}
	
	public void info() {
		System.out.println("Sample1 class method");
	}
}
public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Interf2 i = ()-> new Sample1();
        i.m1().info();
        
        Interf2 i1 = Sample1::new;
        i1.m1().info();
	}
}
