//надо учесть, что если попнули последний элемент, надо обнулить ссылки начала и конца. TOstring с одной и с другой сторон
package lesson7.deque;

import lesson7.deque.Node;

public class LinkedDeque<T> extends AbstractDeque<T> implements Deque<T> {

	private Node<T> head, tail;
	private int size;

	@Override
	public void push(T el) {
		Node<T> nod = new Node<>();
		nod.el = el;
		if (tail == null) {
			head = nod;
			tail = nod;
			size++;
		} else {
			tail.left = nod;
			nod.right = tail;
			tail = nod;
			size++;
		}
	}

	@Override
	public T pop() {
		T el = head.el;
		head.right = null;
		head = head.left;
		size--;
		return el;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T take() {
		return (T) (head != null ? head.el : 0);
	}

	@Override
	public int size() {
		return size;
	}

	public String toString() {
		Node<T> tmp = head;
		if (tmp == null)
			return "[]";
		StringBuilder sb = new StringBuilder("[");
		while (tmp != null) {
			sb.append(tmp.el).append(", ");
			tmp = tmp.left;
		}
		return sb.delete(sb.length() - 2, sb.length()).append("]").toString();
	}

	public String toStringFormLast() {
		Node<T> tmp = tail;
		if (tmp == null)
			return "[]";
		StringBuilder sb = new StringBuilder("[");
		while (tmp != null) {
			sb.append(tmp.el).append(", ");
			tmp = tmp.right;
		}
		return sb.delete(sb.length() - 2, sb.length()).append("]").toString();
	}

	@Override
	public T popLast() {
		T el = tail.el;
		tail.left = null;
		tail = tail.right;
		size--;
		return el;
	}

	@Override
	public void pushFirst(T el) {
		Node<T> nod = new Node<>();
		nod.el = el;
		if (tail == null) {
			head = nod;
			tail = nod;
			size++;
		} else {
			head.right = nod;
			nod.left = head;
			head = nod;
			size++;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T takeLast() {
		return (T) (tail != null ? tail.el : 0);
	}

	public static void main(String[] args) {
		Deque<Number> dq1 = new LinkedDeque<>();
		for (int i = 1; i <= 5; i++)
			dq1.push(i);
		System.out.println(dq1.toString());
		Deque<Double> dq2 = new LinkedDeque<>();
		for (double i = 10; i <= 15; i++)
			dq2.push(i);
		System.out.println(dq2.toString());
//dq1.pushAll(dq2);		System.out.println(dq1.toString());
dq2.popAll(dq1);		System.out.println(dq1.toString());
	}

}
