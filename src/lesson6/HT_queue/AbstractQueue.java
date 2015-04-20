package lesson6.HT_queue;

public abstract class AbstractQueue<T> implements Queue<T> {

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void pushAll(Queue<? extends T> q) {
		while (!q.isEmpty())
			push(q.pop());
	}

	@Override
	public void popAll(Queue<? super T> q) {
		while (!isEmpty())
			q.push(pop());
	}

}
