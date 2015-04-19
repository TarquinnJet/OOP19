package lesson6.stack;

public interface Stack <E>{
	
	void push(E el);
	E pop();
	E take();
	int size();
	boolean isEmpty();
	
	void pushAll(Stack<E> s);
	void popAll(Stack<E> s);

}
