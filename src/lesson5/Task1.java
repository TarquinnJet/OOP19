package lesson5;

public class Task1 {
	public static void main(String[] args) {
		// foo(10); // тут пример статического связывания
		// foo(10, 20);///
		A a = new B();
		A a1 = new B();
		A a2 = new C();
		a.f();
		foo(a1);
		foo(a2);
		// }
		//
		// private static void foo(int i, int j) {/// |
		// // TODO Auto-generated method stub
		//
		// }
		//
		// private static void foo(int i) {//// |
		// // TODO Auto-generated method stub
		//
	}

	public static void foo(A a) {
		a.callF();
	}
}

abstract class A {
	public void callF() {
		f();
	}

	public abstract void f();
}

class B extends A {
	public void f() {
		System.out.println("B:f()");

	}
}

class C extends B {
	public void f() {
		System.out.println("C:f()");
	}
}