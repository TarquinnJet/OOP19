package lesson6.HT_queue;

public class Node {
	Node next;
	Node last;
	int el;

	public Node() {
	}

	public Node(int el, Node next, Node last) {
		this.el = el;
		this.next = next;
		this.last = last;
	}
}
