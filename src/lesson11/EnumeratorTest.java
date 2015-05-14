package lesson11;

import java.util.ArrayList;
import java.util.List;

public class EnumeratorTest {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3 };
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		
		Enumerator<Integer> arrayEnumerator = new ArrayEnumerator<>(arr);
		Enumerator<Integer> listEnumerator = new ListEnumerator<>(list);
		
		List<Enumerator<Integer>> enumerators = new ArrayList<>();
		
//		enumerate(arrayEnumerator);
//		enumerate(listEnumerator);
		enumerators.add(arrayEnumerator);
		enumerators.add(listEnumerator);
		
		for (int i = 0; i < enumerators.size(); i++) {
			enumerate(enumerators.get(i));
			
		}
		
	}

	public static void enumerate(Enumerator<Integer> enumerator) {
		while (enumerator.hasNext()) {
			System.out.println(enumerator.next());
		}
	}

}

interface Enumerator<E> {
	boolean hasNext();

	E next();
}

class ListEnumerator<E> implements Enumerator<E> {
	private List<? extends E> list;
	private int pos;

	public ListEnumerator(List<? extends E> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return pos < list.size();
	}

	@Override
	public E next() {
		return list.get(pos++);
	}
}

class ArrayEnumerator<E> implements Enumerator<E> {
	private E[] array;
	private int pos;

	public ArrayEnumerator(E[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return pos < array.length;
	}

	@Override
	public E next() {
		return array[pos++];
	}
}
