package lesson8.HW;


public interface List<E> {

	void add(E element);

	void add(int idx, E element);

	E get(int idx);

	E set(int idx, E element);

	E remove(int idx);
	
	int indexOf(Object o);

	int lastIndexOf(Object o);

	boolean contains(Object o);
	
	List<E> subList(int fromIdx, int toIdx);

	void clear();

	boolean addAll(List<? extends E> list);

	boolean addAll(int idx, List<? extends E> c);

	int size();

	boolean isEmpty();

}