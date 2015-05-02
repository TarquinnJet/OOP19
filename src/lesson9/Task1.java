package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Task1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>(Arrays.asList(new User("Petr",
				30), new User("Georg", 7), new User("Vasia", 7)));
		System.out.println(list);
		Collections.sort(list, User.cmpByName);
		System.out.println(list);

		
		Comparator<User> cpm = new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				
				return 0;
			}
			
		};
		
	}
}

class User implements Comparable<User> {
	public static final Comparator <User> cmpByName = new CmpByName();
	public static final Comparator <User> cmpByAge = new CmpByAge();
	String name;
	int age;

	public User(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " : " + age;

	}

	@Override
	public int compareTo(User o) {

		if (age - o.age == 0) {
			return name.compareTo(o.name);
		} else {
			return age - o.age;
		}

	}

	static class CmpByAge implements Comparator<User> {

		@Override
		public int compare(User o1, User o2) {
			return o1.age - o2.age;
		}

	}

	 private static class CmpByName implements Comparator<User> {

		@Override
		public int compare(User o1, User o2) {
			return o1.name.compareTo(o2.name);
		}

	}
}