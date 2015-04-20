package lesson7.deque;

import lesson6.HT_queue.Queue;

public interface Deque<E> extends Queue<E> {
	E popLast();

	E takeLast();

	void pushFirst(E el);

	void pushAllFirst(Queue<E> q);

	void popAllLast(Queue<E> q);

	String toStringFormLast();

}
