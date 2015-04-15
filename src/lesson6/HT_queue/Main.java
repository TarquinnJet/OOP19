package lesson6.HT_queue;

public class Main {

	public static void main(String[] args) {
		Queue q1 = new ArrayQueue();
		Queue q2 = new ArrayQueue();
		System.out.println(q1.toString());System.out.println(q1.size());
		q1.push(1);
		q1.push(11);
		q1.push(111);
		q1.push(2);
		q1.push(22);
		q1.push(222);
		q1.push(3);
		q1.push(33);
		q1.push(333);
		q1.push(4);
		System.out.println(q1.toString());System.out.println(q1.size());
		q1.pop();
		q1.pop();
		q1.push(33);
		q1.pop();
		q1.push(7);
		// q1.push(333);
		System.out.println(q1.toString());
		System.out.println(q1.size());
	}
}
