package lesson6.HT_queue;

import lesson6.HT_queue.Node;

public class LinkedQueue extends AbstractQueue {
	private Node first, last;
	private int size;

	@Override
	public void push(int el) {
		Node nod = new Node();
		nod.el = el;
		nod.next=first.last;
		nod.last=last;
		//надо как-то однократно до рор() описать присваивание первому.
		first = nod.next;
		last = nod;
	}

	@Override
	public int pop() {
		int el = first.el;
		first = first.last;
		return el;
	}

	@Override
	public int take() {
		if (first != null) {
			int el = first.el;
			return el;
		}
		return (Integer) null;
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
