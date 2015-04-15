package lesson6.HT_queue;

public abstract class AbstractQueue implements Queue {

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void pushAll(Queue q) {
		while (!q.isEmpty())
			push(q.pop());
	}

	@Override
	public void popAll(Queue q) {
		while (!isEmpty())
			q.push(pop());
	}

}
