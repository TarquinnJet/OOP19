package lesson6.stack;

public interface Stack {
	
	void push(int el);
	Integer pop();
	Integer take();
	int size();
	boolean isEmpty();
	
	void pushAll(Stack s);
	void popAll(Stack s);

}
