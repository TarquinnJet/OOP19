package lesson6.HT_queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayQueue<Integer>();
		Queue<Integer> q2 = new ArrayQueue<Integer>();
		System.out.println(q1);
		System.out.println(q2);
		for (int i = 0; i < 5; i++) {
			q1.push(i);q2.push(i*10);
		}
		System.out.println(q1);
		System.out.println(q2);
		q1.popAll(q2);System.out.println(q1);
		System.out.println(q2);
		q2.pop();q2.push(222);q2.pop();
		System.out.println(q1);
		System.out.println(q2);
	}
}
