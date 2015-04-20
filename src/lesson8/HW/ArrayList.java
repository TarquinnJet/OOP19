package lesson8.HW;

public class ArrayList<E> extends AbstractList<E> {

	public static final int DEFAULT_CAPACITY = 20;

	private E[] data;
	private int size;

	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	private boolean check() {
		return false;
	}

	@Override
	public void add(E element) {
		if (size == data.length) {
			E[] datatmp = (E[]) new Object[data.length * 3 / 2 + 1];
			for (int i = 0; i < data.length; i++) {
				datatmp[i] = data[i];
			}
			data = datatmp;
		}
		data[size] = element;
		size++;
	}

	@Override
	public void add(int idx, E element) {
		if (size == data.length) {
			E[] datatmp = (E[]) new Object[data.length * 3 / 2 + 1];
			for (int i = 0; i < idx; i++)
				datatmp[i] = data[i];
			datatmp[idx] = element;
			for (int i = idx + 1; i < data.length; i++)
				datatmp[i] = data[i];
			data = datatmp;
		} else {
			for (int i = data.length - 1; i >= idx; i--)
				data[i] = data[i-1];
			data[idx] = element;
		}
		size++;
	}

	@Override
	public E get(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int idx, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<E> subList(int fromIdx, int toIdx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		this.size = 0;
	}

	@Override
	public boolean addAll(List<? extends E> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int idx, List<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
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
