package lesson6.HT;

import lesson6.stack.AbstrackStack;

public class LinkedStack extends AbstrackStack {

	private Node first;
	private int size;

	@Override
	public void push(int el) {
		Node nd = new Node();
		nd.el = el;
		nd.next = first;
		first = nd;
		// first = new Node(el, first);
		size++;
	}

	@Override
	public Integer pop() {
		if (first != null) {
			int el = first.el;
			first = first.next;
			size--;
			return el;
		}
		return null;
	}

	@Override
	public Integer take() {
		if (first != null) {
			int el = first.el;
			return el;
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	public String toString() {
		Node tmp = first;
		if (tmp == null)
			return "[]";
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
