package lesson6.HT;

import lesson6.stack.Stack;

public class Node {
	Node next;
	int el;

	public Node() {
	}

	public Node(int el, Node next) {
		this.el = el;
		this.next = next;
	}
	public static void main(String[] args) {
		Stack ls1 = new LinkedStack();
		Stack ls2 = new LinkedStack();
		ls1.push(1);
		ls1.push(11);
		ls1.push(111);
		ls2.push(2);
		ls2.push(22);
		ls2.push(222);
		ls2.pushAll(ls1);
		System.out.println(ls2.take());
		System.out.println(ls2.size());
		System.out.println(ls1.size());
		System.out.println(ls1.toString());
		System.out.println(ls2.toString());
	}
}
