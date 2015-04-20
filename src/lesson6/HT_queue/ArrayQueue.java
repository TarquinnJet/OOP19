package lesson6.HT_queue;

public class ArrayQueue<T> extends AbstractQueue<T> {
	public static final int DEFAULT_CAPACITY = 10;
	private T[] data;
	private int headQueue, tailQueue;
	private boolean isUsedAtListOnce;

	public ArrayQueue() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		data = (T[]) new Object[capacity];
	}

	@Override
	public void push(T el) {
		data[tailQueue] = el;
		if (tailQueue == data.length - 1)
			tailQueue = 0;
		else
			tailQueue++;
		// if (++tailQueue == data.length)
		// tailQueue = 0;
		// data[tailQueue] = el;
		isUsedAtListOnce = true;
	}

	@Override
	public T pop() {
		if (size() != 1) {
			T el;
			el = data[headQueue];
			if ((headQueue == data.length - 1) && (tailQueue > 0))
				headQueue = 0;
			else
				headQueue++;
			return el;
		} else {
			T el;
			el = data[headQueue];
			headQueue = tailQueue = 0;
			isUsedAtListOnce = false;
			return el;
		}
	}

	@Override
	public T take() {
		return data[headQueue];
	}

	@Override
	public int size() {
		if (headQueue < tailQueue)
			return tailQueue - headQueue;
		else if ((headQueue == tailQueue) && (!isUsedAtListOnce))
			return 0;
		return DEFAULT_CAPACITY - headQueue + tailQueue;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < data.length; i++) {
			if (size() == DEFAULT_CAPACITY)
				sb.append(data[i]).append(", ");
			else if (headQueue > tailQueue) {
				if ((i < tailQueue) || (i >= headQueue))
					sb.append(data[i]).append(", ");
				else
					sb.append("\" _ \"").append(", ");
			} else if ((headQueue <= i) && (i < tailQueue))
				sb.append(data[i]).append(", ");
			else
				sb.append("\" _ \"").append(", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		return sb.append("]").toString();
	}
}
