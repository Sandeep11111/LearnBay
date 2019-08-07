package methodAndConstructorReferencesByUsingDoubleColonOperator;

public class MethodReferenceWithDoubleColon {

	public static void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread-1");
		}
	}

	public static void main(String[] args) {
		Runnable r = MethodReferenceWithDoubleColon::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
