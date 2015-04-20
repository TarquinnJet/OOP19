package lesson6;

import lesson6.stack.ArrayStack;
import lesson6.stack.Stack;

public class Task1 {
	public static void main(String[] args) {
		Stack<Integer> s1 = new ArrayStack<>();
		Stack<Integer> s2 = new ArrayStack<>();
		for (int i = 1; i < 3; i++) {
			s1.push(i);
			s2.push(i*2);
		}
		System.out.println(s1);System.out.println(s2);
		s1.pushAll(s2);
		System.out.println(s1);System.out.println(s2);
	}
}

class A extends Task1 implements F {

	@Override
	public void f() {

	}

}

interface F {
	void f();

	int A = 10;

}
