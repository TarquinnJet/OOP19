package lesson6.stack;

public abstract class AbstrackStack implements Stack {

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void popAll(Stack s) {
		while (!isEmpty()) {
			s.push(pop());
		}
	}
	@Override
	public void pushAll(Stack s) {
		while (!s.isEmpty()) {
			push(s.pop());
		}
	}
}
