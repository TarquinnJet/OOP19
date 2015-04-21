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

	private boolean isIdxCorrect(int idx) {
		if (0 < idx && idx <= size()) {
			return true;
		} else {
			throw new IllegalArgumentException("wrong idx!");
		}
	}

	private void resizeData() {
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
		if (isIdxCorrect(idx) == true) {
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
					data[i] = data[i - 1];
				data[idx] = element;
			}
			size++;
		}
	}

	@Override
	public E get(int idx) {
		return isIdxCorrect(idx) == true ? data[idx] : data[idx];
	}

	@Override
	public E set(int idx, E element) {
		if (isIdxCorrect(idx) == true) {
			E tmp = data[idx];
			data[idx] = element;
			return tmp;
		}
		return null;
	}

	@Override
	public E remove(int idx) {
		if (isIdxCorrect(idx) == true) {
			E tmp = data[idx];
			for (int i = idx + 1; i < data.length; i++) {
				data[i] = data[i - 1];
			}
			size--;
			return tmp;
		}
		return null;
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
		if (fromIdx < toIdx && isIdxCorrect(fromIdx) && isIdxCorrect(toIdx)) {
			List<E> tmp = new ArrayList<>();
			for (int i = fromIdx; i <= toIdx; i++) {
				tmp.add(data[i]);
			}
			return tmp;
		}
		throw new RuntimeException("wrong Idx");
	}

	@Override
	public void clear() {
		this.size = 0;
	}

	@Override
	public boolean addAll(List<? extends E> list) {

		return false;
	}

	@Override
	public boolean addAll(int idx, List<? extends E> c) {

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
