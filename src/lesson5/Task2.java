package lesson5;

public class Task2 {
	public static void main(String[] args) {
		foo f = new F();
		Aaa f1 = new F();
		F b = new F();
		f1(f);
		f2(f1);
		f3(b);
	}

	private static void f1(foo f) {
		// TODO Auto-generated method stub

	}

	private static void f2(Aaa f) {
		// TODO Auto-generated method stub

	}

	private static void f3(F b) {
		// TODO Auto-generated method stub

	}

	class A {
		public void f() {
			System.out.println("A:F()");
		}
	}

	abstract class B extends A {
		@Override
		public abstract void f();

		@Override
		public abstract String toString();
	}

	class C extends B {

		@Override
		public void f() {
			// TODO Auto-generated method stub

		}

		@Override
		public String toString() {
			// будь любезен - переопредели
			return null;
		}

	}
}

class F extends B implements foo, Aaa {
}

interface foo {

}

interface Aaa {
}