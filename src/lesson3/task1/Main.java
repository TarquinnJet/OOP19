package lesson3.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Marker m1 = new Marker();
		Marker m2 = new Marker();
		System.out.println(m1.color);
		m1.color = "red";
		m2.color = "black";
		System.out.println(m1.color);
		System.out.println(m2.color);
		m1.print();
		m2.print();

		Automobil auto1 = new Automobil("VAZ 2101", 40, 9, 34567, 21, false);

		Automobil auto2 = new Automobil("VAZ 2106", 40, 9, 87654, 11, false);

		Automobil auto3 = new Automobil("Volga", 70, 12, 345670, 11, true);

		Automobil auto4 = new Automobil("VAZ 2111", 65, 8, 123456, 43, false);

		Automobil auto5 = new Automobil("VAZ 2115",80, 11, 345678, 1, true);

		ArrayList<Automobil> cars = new ArrayList<>(Arrays.asList(auto1, auto2,
				auto3, auto4, auto5));
		for (Automobil car : cars) { // foreach;
			car.about();
			car.move(120);
			car.about();
		}
	}
}
