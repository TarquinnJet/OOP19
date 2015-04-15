package lesson6.HT_queue;

public class ArrayQueue extends AbstractQueue {
	public static final int DEFAULT_CAPACITY = 10;
	private int[] data;
	private int headQueue, endQueue;

	public ArrayQueue() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayQueue(int capacity) {
		data = new int[capacity];
	}

	@Override
	public void push(int el) {
		data[endQueue] = el;
		if (endQueue == data.length - 1)
			endQueue = 0;
		else
			endQueue++;
	}

	@Override
	public int pop() {
		int el;
		el = data[headQueue];
		if ((headQueue == data.length - 1) && (endQueue > 0))
			headQueue = 0;
		else
			headQueue++;
		return el;
	}

	@Override
	public int take() {
		return data[headQueue];
	}

	@Override
	public int size() {
		if (headQueue < endQueue)
			return endQueue - headQueue;
		else
			return DEFAULT_CAPACITY - headQueue + endQueue;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < data.length; i++) {
			if (headQueue > endQueue) {
				if ((i < endQueue) || (i >= headQueue))
					sb.append(data[i]).append(", ");
				else
					sb.append("\" _ \"").append(", ");
			} else if ((headQueue <= i) && (i < endQueue))
				sb.append(data[i]).append(", ");
			else
				sb.append("\" _ \"").append(", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		return sb.append("]").toString();
	}
}
