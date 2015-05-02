//4 ���� ���������� �������. static nested � inner, ������� ������ named �  anonymous. ��������� ������ ��������� �� ������ ��� ����������� 
//��� ������ ,��� ������������ ������
package lesson10;

public class Task1 {

	private class Node<V> {
		@SuppressWarnings("unused")
		public Node<V> left;
		@SuppressWarnings("unused")
		public Node<V> right;
		@SuppressWarnings("unused")
		public V el;

		@SuppressWarnings("unused")
		public Node() {
		}

		@SuppressWarnings("unused")
		public Node(V el, Node<V> left, Node<V> right) {
			this.el = el;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		A a = new A(999);
		A.B b = new A.B();
		b.foo(a);

	}
}

class A {
	private int foo;

	public A(int foo) {
		this.foo = foo;
	}

	static class B {
		public void foo(A a) {
			System.out.println(a.foo);
		}
	}
}
