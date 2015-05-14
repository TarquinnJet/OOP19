package lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);

		}
		for (Integer i : list) {
			if (i.equals(5)) {
				// list.remove(i);
			}
			System.out.println(i);
		}

		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			Integer i = iter.next();
			if (i % 2 != 0) {
				// list.remove(i);
				iter.remove();
			}
		}
		System.out.println(list);
	}
}
