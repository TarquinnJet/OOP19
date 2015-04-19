package lesson6.HT_queue;

public interface Queue<T> {

	void push(T el);

	T pop();

	T take();

	int size();

	boolean isEmpty();

	void pushAll(Queue<T> q);

	void popAll(Queue<T> q);
}
