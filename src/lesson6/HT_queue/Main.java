package lesson6.HT_queue;

public class Main {

	public static void main(String[] args) {
		 Queue q1 = new ArrayQueue();
//		Queue q2 = new LinkedQueue();
//		Queue q3 = new LinkedQueue();
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
		 q1.push(333);q1.pop();q1.pop();
		 System.out.println(q1.toString());
		 System.out.println(q1.size());
//		q2.push(1);
//		q3.push(5);
//		q2.push(11);
//		q3.push(55);
//		q2.push(111);
//		q3.push(555);
//		System.out.println(q2.toString());
//		System.out.println(q3.toString());
//		q2.pop();
//		q3.pop();
//		System.out.println(q2.toString());
//		System.out.println(q3.toString());
//		q2.push(1111);
//		q3.push(5555);
//		System.out.println(q2.toString());
//		System.out.println(q3.toString());
//		q2.popAll(q3);
//		System.out.println(q2.toString());
//		System.out.println(q3.toString());
//		q2.pushAll(q3);
//		System.out.println(q2.toString());
//		System.out.println(q3.toString());
	}
}
