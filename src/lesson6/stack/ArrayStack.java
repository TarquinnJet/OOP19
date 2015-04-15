package lesson6.stack;

public class ArrayStack extends AbstrackStack {

	public static final int DEFAULT_CAPACITY = 10;

	private int[] data;
	private int size;

	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayStack(int capacity) {
		data = new int[capacity];
	}

	@Override
	public void push(int el) {
		if (size < data.length)
			data[size] = el;
		size++;
	}

	@Override
	public Integer pop() {
		Integer el;
		if (isEmpty())
			el = null;
		el = data[--size];
		return el;
	}

	@Override
	public Integer take() {

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
			else sb.append(data[i]).append("]");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Stack s1 = new ArrayStack();
		Stack s2 = new ArrayStack();

		s1.push(3);
		s2.push(44);
		System.out.println(s1);
		System.out.println(s2);
		s1.pushAll(s2);
		System.out.println(s1);
		System.out.println(s2);
		s1.popAll(s2);
		System.out.println(s1);
		System.out.println(s2);
	}
}
