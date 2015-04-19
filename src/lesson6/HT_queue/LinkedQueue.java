package lesson6.HT_queue;

import lesson6.HT.Node;

public class LinkedQueue<E> extends AbstractQueue<E> {
	private Node<E> head, tail;
	private int size;

	@Override
	public void push(E el) {
		Node<E> nod = new Node<>();
		nod.el = el;
		if (tail == null) {
			head = nod;
			tail = nod;
			size++;
		} else {
			tail.next = nod;
			tail = nod;
			size++;
		}
	}

	@Override
	public E pop() {
		E el = head.el;
		head = head.next;
		size--;
		return el;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E take() {
		return (E) (head != null ? head.el : 0);
	}

	@Override
	public int size() {
		return size;
	}

	public String toString() {
		Node<E> tmp = head;
		if (tmp == null)
			return "[]";
		StringBuilder sb = new StringBuilder("[");
		while (tmp != null) {
				sb.append(tmp.el).append(", ");
			tmp = tmp.next;
		}
		return sb.delete(sb.length() - 2, sb.length()).append("]").toString();
	}
}
