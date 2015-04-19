package lesson6.stack;

public abstract class AbstrackStack<E> implements Stack<E> {

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void popAll(Stack<E> s) {
		while (!isEmpty()) {
			s.push(pop());
		}
	}
	@Override
	public void pushAll(Stack<E> s) {
		while (!s.isEmpty()) {
			push(s.pop());
		}
	}
}
