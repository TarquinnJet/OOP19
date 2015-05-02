package lesson10.set;

public interface Set<E> {

	boolean add(E el);

	boolean contains(E el);

	boolean remove(E el);

	boolean isEmpty();

	int size();

}
