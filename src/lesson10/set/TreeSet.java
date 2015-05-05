package lesson10.set;

public class TreeSet<E extends Comparable<E>> implements Set<E> {
	Node<E> root;
	private int size;

	private static class Node<T> {
		Node<T> left;
		Node<T> right;
		@SuppressWarnings("unused")
		Node<T> parent;
		T val;

		public Node(T val, Node<T> parent) {
			this.val = val;
			this.parent = parent;
		}

		@SuppressWarnings("unused")
		public Node(T val, Node<T> left, Node<T> right, Node<T> parent) {
			this.val = val;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}
	}

	@Override
	public boolean add(E el) {
		if (root == null) {
			root = new Node<E>(el, null);
			size++;
			return true;
		}

		return add(el, root);
	}

	private boolean add(E el, Node<E> node) {
		int cmp = compare(el, node.val);

		if (cmp == 0) {
			return false;
		} else if (cmp > 0) {
			if (node.right == null) {
				node.right = new Node<>(el, node);
				size++;
				return true;
			} else {
				return add(el, node.right);
			}
		} else {
			if (node.left == null) {
				node.left = new Node<>(el, node);
				size++;
				return true;
			} else {
				return add(el, node.left);
			}
		}
	}

	private int compare(E el1, E el2) {
		return el1.compareTo(el2);
	}

	@Override
	public boolean contains(E el) {
		Node<E> tmp = root;
		while (tmp != null) {
			int cmp = compare(el, tmp.val);
			if (cmp == 0) {
				return true;
			} else if (cmp > 0) {
				tmp = tmp.right;
			} else {
				tmp = tmp.left;
			}
		}
		return false;
	}

	@Override
	public boolean remove(E el) {
		Node<E> tmp = root, y = null;
		while (tmp != null) {
			int cmp = compare(el, tmp.val);
			if (cmp == 0) {
				break;
			} else {
				y = tmp;
				if (cmp < 0) {
					tmp = tmp.left;
				} else {
					tmp = tmp.right;
				}
			}
		}
		if (tmp == null) {
			return false;
		}
		if (tmp.right == null) {
			if (y == null) {
				root = tmp.left;
				return true;
			} else {
				if (tmp == y.left) {
					y.left = tmp.left;
					return true;
				} else {
					y.right = tmp.left;
					return true;
				}
			}
		} else {
			Node<E> leftMost = tmp.right;
			y = null;
			while (leftMost.left != null) {
				y = leftMost;
				leftMost = leftMost.left;
			}
			if (y != null) {
				y.left = leftMost.right;
			} else {
				tmp.right = leftMost.right;
			}
			tmp.val = leftMost.val;
			return true;
		}
	}

	@Override
	public String toString() {
		if (size() == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
		toString(root, sb);
		return sb.delete(sb.length() - 2, sb.length()).append("]").toString();
	}

	private void toString(Node<E> node, StringBuilder sb) {
		if (node.left != null) {
			toString(node.left, sb);
		}

		sb.append(node.val).append(", ");

		if (node.right != null) {
			toString(node.right, sb);
		}
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		this.root = null;
		size=0;
		
	}
	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>();
		tr.add(10);
		tr.add(1);
		tr.add(4);
		tr.add(8);
		tr.add(1);
		tr.add(6);
		System.out.println(tr.remove(8));
		System.out.println(tr);
		System.out.println(tr.contains(6));
	}

	
}
