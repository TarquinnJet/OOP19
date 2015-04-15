package lesson4;

import lesson3.task1.*;

public class Truck extends Automobil {

	int weight;

	public Truck(String model, int tankCapacity, int fuelConsuption,
			int mileage, int nowFuel, boolean engineStart, int weight) {
		super(model, tankCapacity, fuelConsuption, mileage, nowFuel,
				engineStart);
		this.weight = weight;
	}

	public Truck() {
		super();
	}
}
