/**
 * 
 */
package uber;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author sandeepkumarsingh
 *https://self-learning-java-tutorial.blogspot.com/2016/07/implement-custom-iterator-in-java.html
 */
public class CustomIteratorToFindEvenList<T> implements Iterable<T> {
 
	private List<T> list; 
	
	CustomIteratorToFindEvenList(List<T> list){
		this.list = list;
	}
	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		 CustomIteratorToFindEvenList<Integer> myList = new CustomIteratorToFindEvenList<>(list);

		  Iterator<Integer> iter = myList.iterator();
		  while (iter.hasNext()) {
		   System.out.println(iter.next());
		  }

	}

	@Override
	public Iterator<T> iterator() {
		return new EvenIterator<T>();
	}
	
	private class EvenIterator<T> implements Iterator<T> {
        int size = list.size();
        int currentPointer = 0;
        
		@Override
		public boolean hasNext() {
			return currentPointer < size;
		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			@SuppressWarnings("unchecked")
			T val = (T) list.get(currentPointer);
			currentPointer += 2;
			return val;
		}
	}
}
