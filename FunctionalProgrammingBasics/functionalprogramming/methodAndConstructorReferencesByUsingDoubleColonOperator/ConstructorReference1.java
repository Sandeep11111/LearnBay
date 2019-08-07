package methodAndConstructorReferencesByUsingDoubleColonOperator;

interface Interf1
{
	public Sample m1();
}

class Sample{
	Sample(){
		
	}
}
public class ConstructorReference1 implements Interf1{

	public static void main(String[] args) {

		
	}

	@Override
	public Sample m1() {
		// TODO Auto-generated method stub
		return new Sample();
	}

}

//Interf i =()->new Sample();
//Interf i = Sample::new;
