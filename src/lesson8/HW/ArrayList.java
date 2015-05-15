package lesson8.HW;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import lesson7.deque.Node;

public class ArrayList<E> extends AbstractList<E> implements Comparator<E>,
		Comparable<E> {

	public static final int DEFAULT_CAPACITY = 20;

	private E[] data;
	private int size;

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int cursor;
			int lastNextShown = -1;
			int size = ArrayList.this.size;

			@Override
			public boolean hasNext() {
				return cursor != size;
			}

			@Override
			public E next() {
				int i = cursor;
				if (i >= size)
					throw new NoSuchElementException();
				cursor = i + 1;
				return (E) data[lastNextShown = i];
			}

			@Override
			public void remove() {
				if (lastNextShown < 0)
					throw new IllegalStateException();
				ArrayList.this.remove(lastNextShown);
				cursor = lastNextShown;
				lastNextShown = -1;
			}

			public void check() {
				if (!(size == ArrayList.this.size))
					throw new ConcurrentModificationException();
			}

			public boolean hasPrevious() {
				return cursor != 0;
			}

			public int nextIndex() {
				return cursor;
			}

			public int previousIndex() {
				return cursor - 1;
			}

			@SuppressWarnings("unchecked")
			public E previous() {
				int i = cursor - 1;
				if (i < 0)
					throw new NoSuchElementException();

				cursor = i;
				return (E) data[lastNextShown = i];
			}

			public void set(E e) {
				if (lastNextShown < 0)
					throw new IllegalStateException();

				ArrayList.this.set(lastNextShown, e);

			}

			public void add(E e) {

				int i = cursor;
				ArrayList.this.add(i, e);
				cursor = i + 1;
				lastNextShown = -1;

			}
		};
	}

	@Override
	public int compareTo(E o) {
		return 0;
	}

	@Override
	public int compare(E o1, E o2) {
		return 0;
	}

	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity<0");
		}
		data = (E[]) new Object[capacity];
	}

	private void isIdxCorrect(int idx) {
		if (!(0 <= idx && idx <= size())) {
			throw new IndexOutOfBoundsException("wrong idx!");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(E element) {
		if (size == data.length) {
			E[] datatmp = (E[]) new Object[data.length * 3 / 2 + 1];
			for (int i = 0; i < data.length; i++) {
				datatmp[i] = data[i];
			}
			data = datatmp; // System.arraycopy(data, 0, datatmp, 0,
							// data.length);
		}
		data[size] = element;
		size++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(int idx, E element) {
		isIdxCorrect(idx);
		if (size() == data.length) {
			E[] datatmp = (E[]) new Object[data.length * 3 / 2 + 1];
			for (int i = 0; i < idx; i++) {
				datatmp[i] = data[i];
			}
			for (int i = size() - 1; i >= idx; i--) {
				datatmp[i + 1] = data[i];
			}
			datatmp[idx] = element;
			data = datatmp;
		} else {
			for (int i = data.length - 1; i >= idx; i--)
				data[i] = data[i - 1];
			data[idx] = element;
		}
		size++;
	}

	@Override
	public E get(int idx) {
		isIdxCorrect(idx);
		return data[idx];
	}

	@Override
	public E set(int idx, E element) {
		isIdxCorrect(idx);
		E tmp = data[idx];
		data[idx] = element;
		return tmp;
	}

	@Override
	public E remove(int idx) {
		isIdxCorrect(idx);
		E tmp = data[idx];
		for (int i = idx + 1; i < data.length; i++) {
			data[i - 1] = data[i];
		}
		size--;
		return tmp;
	}

	@Override
	public int indexOf(Object o) {
		int idx = 0;
		for (int i = 0; i < size(); i++) {
			if (o == data[i]) {
				idx = i;
				break;
			} else {
				idx = -1;
			}
		}
		return idx;

	}

	@Override
	public int lastIndexOf(Object o) {
		int idx = 0;
		for (int i = size(); i > -1; i++) {
			if (o == data[i]) {
				idx = i;
				break;
			} else {
				idx = -1;
			}
		}
		return idx;
	}

	@Override
	public List<E> subList(int fromIdx, int toIdx) {
		isIdxCorrect(fromIdx);
		isIdxCorrect(toIdx);
		if (fromIdx < toIdx) {
			List<E> tmp = new ArrayList<>();
			for (int i = fromIdx; i <= toIdx; i++) {
				tmp.add(data[i]);
			}
			return tmp;
		}
		throw new IndexOutOfBoundsException("wrong Idx");
	}

	@Override
	public void clear() {
		this.size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size(); i++) {
			sb.append(data[i]).append(", ");
		}
		return sb.delete(sb.length() - 2, sb.length()).append("]").toString();
	}

}
