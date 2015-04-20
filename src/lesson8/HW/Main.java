package lesson8.HW;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> ari1 = new ArrayList<Integer>();
		for (int i = 1; i <= 20; i++) {
			ari1.add(i);
		}
		ari1.add(123);
		System.out.println(ari1);System.out.println(ari1.size());
		ari1.add(10, 77); System.out.println(ari1);System.out.println(ari1.size());
	}

}
