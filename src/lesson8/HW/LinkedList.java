package lesson8.HW;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import lesson7.deque.Node;

public class LinkedList<T> extends AbstractList<T> {
	private Node<T> head, tail;
	private int size;

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			Node<T> current = head;
			boolean canRemove;
			int listSize = LinkedList.this.size;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				if (!hasNext())
					throw new NoSuchElementException();
				check();
				canRemove = true;
				T el = current.el;
				current = current.right;
				return el;
			}

			@Override
			public void remove() {
				if (!canRemove) {
					throw new IllegalStateException();
				}
				check();
				LinkedList.this.remove(current);
				canRemove = false;
			}

			public void check() {
				if (!(listSize == LinkedList.this.size))
					throw new ConcurrentModificationException();
			}
		};
	}

	private void isIdxCorrect(int idx) {
		if (!(0 <= idx && idx <= size())) {
			throw new IndexOutOfBoundsException("wrong idx!");
		}
	}

	private Node<T> stepper(int idx) {
		Node<T> tmp = null;

		if (idx == 0) {
			return head;
		}
		if (idx == size()) {
			return tail;
		} else {

			if (idx < size() / 2) {
				int i = 0;
				tmp = head;
				while (i < idx) {
					tmp = tmp.right;
					i++;
				}
			} else {
				int i = size();
				tmp = tail;
				while (i > idx) {
					tmp = tmp.left;
					i--;
				}
			}
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
		isIdxCorrect(idx);
		if (idx == 0) {
			addFirst(element);
		}
		if (idx == size()) {
			add(element);
		} else {

			Node<T> nod = new Node<>();
			Node<T> tmp = stepper(idx).left;
			nod.el = element;
			nod.left = tmp;
			nod.right = tmp.right;
			tmp.right.left = nod;
			tmp.right = nod;
			size++;
		}
	}

	@Override
	public T get(int idx) {
		isIdxCorrect(idx);
		return stepper(idx).el;
	}

	@Override
	public T set(int idx, T element) {
		T tmp = null;
		isIdxCorrect(idx);
		tmp = stepper(idx).el;
		stepper(idx).el = element;
		return tmp;

	}

	@Override
	public T remove(int idx) {
		isIdxCorrect(idx);
		Node<T> curr = stepper(idx);
		T tmp = curr.el;
		remove(curr);
		return tmp;
	}

	private void remove(Node<T> curr) {
		if (curr == head) {
			head = head.right;
			head.left = null;
			size--;
		}else if (curr == tail) {
			tail = tail.left;
			tail.right = null;
			size--;
		} else {
			Node<T> prev = curr.left;
			Node<T> next = curr.right;
			next.left = curr.left;
			prev.right = curr.right;
			size--;
		}
	}

	@Override
	public int indexOf(Object o) {
		int i = 0;
		while (stepper(i).right != null) {
			if (stepper(i).el == o) {
				break;
			} else {
				i++;
			}
		}
		return i;
	}

	@Override
	public int lastIndexOf(Object o) {
		int i = size();
		
		while (stepper(i).left != null) {
			if (stepper(i).el.equals(o)) {
				break;
			} else {
				i--;
			}
		}
		return i - 1;
	}

	@Override
	public List<T> subList(int fromIdx, int toIdx) {
		isIdxCorrect(fromIdx);
		isIdxCorrect(toIdx);
		if (fromIdx < toIdx) {
			List<T> tmp = new LinkedList<>();
			Node<T> tmpNode = stepper(fromIdx);
			while (tmpNode != stepper(toIdx).right) {
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
