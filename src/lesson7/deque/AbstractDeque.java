package lesson7.deque;

import lesson6.HT_queue.AbstractQueue;
import lesson6.HT_queue.Queue;

public abstract class AbstractDeque<T>  extends AbstractQueue<T> implements Deque<T>{

	@Override
	public void pushAllFirst(Queue<T> q) {
		while (!q.isEmpty())
			pushFirst(q.pop());
	}

	@Override
	public void popAllLast(Queue<T> q) {
		while (!q.isEmpty())
			q.push(popLast());
	}

}
