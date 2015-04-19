package lesson6.HT;

import lesson6.stack.AbstrackStack;

public class LinkedStack<T> extends AbstrackStack <T>{

	private Node<T> first;
	private int size;

	@Override
	public void push(T el) {
		Node<T> nd = new Node<>();
		nd.el = el;
		nd.next = first;
		first = nd;
		// first = new Node(el, first);
		size++;
	}

	@Override
	public T pop() {
		if (first != null) {
			T el = first.el;
			first = first.next;
			size--;
			return el;
		}
		return null;
	}

	@Override
	public T take() {
		if (first != null) {
			T el = first.el;
			return el;
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	public String toString() {
		Node<T> tmp = first;
		if (tmp == null)
			return "[]";
		// StringBuilder sb = new StringBuilder(size * 4 + 10);
		// for (Node tmp = first;tmp != null;tmp = tmp.next){like while }
		StringBuilder sb = new StringBuilder("[");
		while (tmp != null) {
			if (tmp.next != null)
				sb.append(tmp.el).append(", ");
			else
				sb.append(tmp.el).append("]");
			tmp = tmp.next;
		}
		return sb.toString();
	}
}
