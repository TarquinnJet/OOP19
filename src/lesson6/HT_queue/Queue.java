package lesson6.HT_queue;

public interface Queue {

	void push(int el);

	int pop();

	int take();

	int size();

	boolean isEmpty();

	void pushAll(Queue q);

	void popAll(Queue q);
}
