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

	@Override
	public T popLast() {
		T el = tail.el;
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

	public static void main(String[] args) {
		Deque<Integer> dq1 = new LinkedDeque<>();
		for (int i = 1; i <= 5; i++)
			dq1.push(i);
		System.out.println(dq1.toString());
		
		Deque<Integer> dq2 = new LinkedDeque<>();
		for (int i = 6; i <= 10; i++)
			dq2.push(i);
		System.out.println(dq2.toString());
		
		Deque<String> dq3 = new LinkedDeque<>();
		dq3.push("a");dq3.push("b");dq3.push("c");dq3.push("d");dq3.push("e");
		System.out.println(dq3.toString());

		Deque<String> dq4 = new LinkedDeque<>();
		dq4.push("f");dq4.push("g");dq4.push("h");dq4.push("i");dq4.push("j");
		System.out.println(dq4.toString());
		
		dq1.pushAllFirst(dq2);System.out.println(dq1.toString());
		dq3.pushAllFirst(dq4);System.out.println(dq3.toString());
		dq1.popLast();System.out.println(dq1.toString());
		
		//dq1.popAllLast(dq2);System.out.println(dq1.toString());
		//dq3.popAllLast(dq4);System.out.println(dq3.toString());
		
	}
}
