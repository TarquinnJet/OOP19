package lesson8.HW;

public class Main {

	public static void main(String[] args) {
//		ArrayList<Integer> ari1 = new ArrayList<Integer>();
//		for (int i = 1; i <= 20; i++) {
//			ari1.add(i);
//		}
//		System.out.println(ari1);
//		int f = ari1.remove(4);
//		System.out.println(f);
//		System.out.println(ari1.size());
//		ari1.add(21);
//		System.out.println(ari1);
//		System.out.println(ari1.size());
//		ari1.add(10, 77);
//		System.out.println(ari1);
//		System.out.println(ari1.size());
//		ari1.add(11, 2);
//		System.out.println(ari1);
//		List<Integer> ss = ari1.subList(10, 15);
//		System.out.println(ss);
//		System.out.println(ss.get(0));
//		ari1.addAll(ss);
//		System.out.println(ari1);
//		List<Integer> k = ari1.subList(2, 10);System.out.println(k);
//		k.addAll(3, ss);
//		System.out.println(k);
		
		LinkedList<Integer> li1 = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			li1.add(i);
		}
//		System.out.println("FW : "+li1.toString()+"  BW :  "+li1.toStringFormLast()+" "+li1.size());
//		li1.add(10, 111);System.out.println("FW : "+li1.toString()+"  BW :  "+li1.toStringFormLast());
//		System.out.print(li1.set(7, 77));System.out.println(" FW : "+li1.toString()+"  BW :  "+li1.toStringFormLast()+" "+li1.size());
//		System.out.print(li1.remove(0));System.out.println(" FW : "+li1.toString()+"  BW :  "+li1.toStringFormLast()+" "+li1.size());
//		System.out.print(li1.remove(10));System.out.println(" FW : "+li1.toString()+"  BW :  "+li1.toStringFormLast()+" "+li1.size());
//		li1.add(8,4);System.out.println(" FW : "+li1.toString()+"  BW :  "+li1.toStringFormLast()+" "+li1.size());
//		System.out.println(li1.indexOf(4));System.out.println(li1.lastIndexOf(4));
		List <Integer> li2 = li1.subList(4, 7);System.out.println(li2);
		LinkedList<Integer> li = (LinkedList<Integer>) li1.subList(4, 7);System.out.println(li);
		li1.addAll(li);System.out.println("FW : "+li1+"  BW :  "+li1.toStringFormLast()+" "+li1.size());
		LinkedList<Integer> li3 = (LinkedList<Integer>) li1.subList(5, 12);System.out.println(li3);
		li1.addAll(8, li3);System.out.println("FW : "+li1+"  BW :  "+li1.toStringFormLast()+" "+li1.size());
	}
}
