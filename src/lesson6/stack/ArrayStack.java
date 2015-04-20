package lesson6.stack;

public class ArrayStack<E> extends AbstrackStack<E> {

	public static final int DEFAULT_CAPACITY = 10;

	private E[] data;
	private int size;

	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	@Override
	public void push(E el) {
		if (size < data.length)
			data[size] = el;
		size++;
	}

	@Override
	public E pop() {
		E el;
		if (isEmpty())
			el = null;
		el = data[--size];
		return el;
	}

	@Override
	public E take() {

		return this.isEmpty() ? null : data[size - 1];
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public String toString() {
		if (isEmpty())
			return "[]";
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			if (i != size - 1)
				sb.append(data[i]).append(", ");
			else
				sb.append(data[i]).append("]");
		}
		return sb.toString();
	}

}
