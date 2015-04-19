package lesson7.deque;

public class Node<V> {
	public Node<V> left;
	public Node<V> right;
	public V el;

	public Node() {
	}

	public Node(V el, Node<V> left, Node <V> right) {
		this.el = el;
		this.left = left;
		this.right = right;
	}
}
