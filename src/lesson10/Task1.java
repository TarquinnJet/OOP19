//4 ���� ���������� �������. static nested � inner, ������� ������ named �  anonymous. ��������� ������ ��������� �� ������ ��� ����������� 
//��� ������ ,��� ������������ ������
package lesson10;

public class Task1 {

	private class Node<V> {
		public Node<V> left;
		public Node<V> right;
		public V el;

		public Node() {
		}

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
