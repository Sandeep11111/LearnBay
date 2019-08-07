package supplier;
import java.util.function.*;

//https://www.youtube.com/watch?v=93lwttyukZY

/*
 * interface Supplier<R>{
 *  R get()      where R is output Type
 * }
 */
public class SupplierBasics {

	public static void main(String[] args) {
		Supplier<String> s=() ->{
			
			String[] s1= {"Sunny","bunny","chinny"};
			int x = (int)(Math.random()*2+1);
			return s1[x];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
