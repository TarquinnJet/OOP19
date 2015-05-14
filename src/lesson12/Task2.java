package lesson12;

import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		
		A a2 = new A(223);
		A.B b = a2.getB();
		A.B b2 = a2.new B();
		b2.print(5);
		ArrayList<Integer>ds = new ArrayList<>();
		ds.iterator();
	}
}

class A {

	private int val;

	public A(int val) {
		this.val = val;
	}

	public B getB() {
		return new B();
	}

	class B {
		private int val;

		public void print(int val) {
			System.out.println(val);
			System.out.println(this.val);
			System.out.println(A.this.val);
		}
	}
}
