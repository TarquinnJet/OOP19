package lesson8.HW;

import lesson7.deque.Node;

public class LinkedList<T> extends AbstractList<T> {
	private Node<T> head, tail;
	private int size;

	private boolean isIdxCorrect(int idx) {
		if (0 <= idx && idx <= size()) {
			return true;
		} else {
			throw new IndexOutOfBoundsException("wrong idx!");
		}
	}

	private Node<T> stepperForward(int idx) {
		Node<T> tmp = head;
		int i = 0;
		if (idx != 0) {
			if (idx != size()) {
				while (i < idx) {
					tmp = tmp.right;
					i++;
				}
				return tmp;
			} else {
				return tail;
			}
		} else {
			return head;
		}
	}

	private Node<T> stepperBackward(int idx) {
		Node<T> tmp = tail;
		int i = 0;
		while (i != idx) {
			tmp = tmp.left;
			i++;
		}
		return tmp;
	}

	@Override
	public void add(T element) {

		Node<T> nod = new Node<>();
		nod.el = element;
		if (tail == null) {
			head = nod;
			tail = nod;
			size++;
		} else {
			tail.right = nod;
			nod.left = tail;
			tail = nod;
			size++;
		}

	}

	private void addFirst(T element) {
		Node<T> nod = new Node<>();
		nod.el = element;
		head.left = nod;
		nod.right = head;
		head = nod;
		size++;
	}

	@Override
	public void add(int idx, T element) {
		if (idx != 0) {
			if (idx != size()) {
				if (isIdxCorrect(idx)) {
					Node<T> nod = new Node<>();
					Node<T> tmp = stepperForward(idx).left;
					nod.el = element;
					nod.left = tmp;
					nod.right = tmp.right;
					tmp.right.left = nod;
					tmp.right = nod;
					size++;
				}
			} else
				add(element);
		} else
			addFirst(element);
	}

	@Override
	public T get(int idx) {
		return isIdxCorrect(idx) ? stepperForward(idx).el : null;
	}

	@Override
	public T set(int idx, T element) {
		T tmp = null;
		if (isIdxCorrect(idx)) {
			tmp = stepperForward(idx).el;
			stepperForward(idx).el = element;
			return tmp;
		}
		return null;
	}

	@Override
	public T remove(int idx) {
		T tmp = null;
		if (isIdxCorrect(idx)) {
			tmp = stepperForward(idx).el;
			if (idx != size()) {
				Node<T> prev = stepperForward(idx).left;
				Node<T> next = stepperForward(idx).right;
				next.left = stepperForward(idx).left;
				prev.right = stepperForward(idx).right;
				return tmp;
			} else {
				tail = stepperForward(idx).left;
				stepperForward(idx).left.right = null;
			}
		}
		return null;
	}

	@Override
	public int indexOf(Object o) {
		int i = 0;
		while (stepperForward(i).right != null) {
			if (stepperForward(i).el == o) {
				break;
			} else {
				i++;
			}
		}
		return i;
	}

	@Override
	public int lastIndexOf(Object o) {
		int i = 0;
		while (stepperBackward(i).left != null) {
			if (stepperBackward(i).el == o) {
				break;
			} else {
				i++;
			}
		}
		return size() - i;
	}

	@Override
	public List<T> subList(int fromIdx, int toIdx) {
		if (fromIdx < toIdx && isIdxCorrect(fromIdx) && isIdxCorrect(toIdx)) {
			List<T> tmp = new LinkedList<>();
			Node<T> tmpNode = stepperForward(fromIdx);
			while (tmpNode != stepperForward(toIdx)) {
				tmp.add(tmpNode.el);
				tmpNode = tmpNode.right;
			}
			return tmp;
		}
		throw new IndexOutOfBoundsException("wrong Idx");
	}

	@Override
	public void clear() {
		tail = head = null;
		size = 0;
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
			tmp = tmp.right;
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
			tmp = tmp.left;
		}
		return sb.delete(sb.length() - 2, sb.length()).append("]").toString();
	}
}
