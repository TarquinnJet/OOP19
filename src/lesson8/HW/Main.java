package lesson8.HW;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> ari1 = new ArrayList<Integer>();
		for (int i = 1; i <= 20; i++) {
			ari1.add(i);
		}
		System.out.println(ari1);
		int f = ari1.remove(4);
		System.out.println(f);
		System.out.println(ari1.size());
		ari1.add(21);
		System.out.println(ari1);
		System.out.println(ari1.size());
		ari1.add(10, 77);
		System.out.println(ari1);
		System.out.println(ari1.size());
		ari1.add(11, 2);
		System.out.println(ari1);
		List<Integer> ss = ari1.subList(10, 15);
		System.out.println(ss);
		System.out.println(ss.get(0));
		ari1.addAll(ss);
		System.out.println(ari1);
		List<Integer> k = ari1.subList(2, 10);System.out.println(k);
		k.addAll(3, ss);
		System.out.println(k);
	}

}
