//https://www.youtube.com/watch?v=93lwttyukZY
package consumer;
import java.util.function.*;

/*
 * Consumer-> when we need any input type and don't need return type
 * interface Consumer<T>{
 *     void accept(T t)   where t is input
 * }
 */
public class ConsumerBasics {
	
	public static void main(String arg []) {
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("Hello");
		c.accept("Durgasoft");
	}
}
